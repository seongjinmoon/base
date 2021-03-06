<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="MNG_IMG" value="${pageContext.request.contextPath}/template/manage/images"/>
<c:set var="_PREFIX" value="/mng/sym/ccm/cde"/>

<c:import url="/mng/template/popTop.do" charEncoding="utf-8">
	<c:param name="title" value="공통코드관리"/>
</c:import>

<div id="cntnts">
<form name="listForm" action="<c:url value='${_PREFIX}/EgovCcmCmmnDetailCodeList.do'/>" method="post">
<input type="hidden" name="searchCode" value="<c:out value='${searchVO.searchCode}'/>"/>
	<p class="total">총 게시물 ${paginationInfo.totalRecordCount}개ㅣ 현재페이지 <strong class="green">${paginationInfo.currentPageNo}</strong>/${paginationInfo.totalPageCount}</p>

	<table class="chart_board">
		<colgroup>
			<col class="co1"/>
			<col class="co6"/>
			<col class="co3"/>
			<col class="co3"/>
			<col class="co3"/>
		</colgroup>
		<thead>
		<tr>  
			<th>순번</th>
			<th>코드ID</th>
			<th>코드</th>
			<th>코드명</th>
			<th>사용여부</th>
		</tr>
		</thead>    
		<tbody>
		<c:forEach items="${resultList}" var="resultInfo" varStatus="status">
		<tr>
			<td nowrap><fmt:formatNumber value="${paginationInfo.totalRecordCount - ((searchVO.pageIndex-1) * searchVO.pageSize) - (status.count - 1)}" type="number"/></td>
			<td nowrap><c:out value="${resultInfo.codeId}"/></td>
			<td nowrap><c:out value="${resultInfo.code}"/></td>
			<td nowrap>
				<c:url var="viewUrl" value="${_PREFIX}/EgovCcmCmmnDetailCodeModify.do">
					<c:if test="${not empty resultInfo.code}"><c:param name="code" value="${resultInfo.code}" /></c:if>
					<c:if test="${not empty resultInfo.codeId}"><c:param name="codeId" value="${resultInfo.codeId}" /></c:if>
					<c:if test="${not empty searchVO.pageIndex}"><c:param name="pageIndex" value="${searchVO.pageIndex}" /></c:if>
					<c:if test="${not empty searchVO.searchCode}"><c:param name="searchCode" value="${searchVO.searchCode}" /></c:if>
					<c:if test="${not empty searchVO.searchCondition}"><c:param name="searchCondition" value="${searchVO.searchCondition}" /></c:if>
					<c:if test="${not empty searchVO.searchKeyword}"><c:param name="searchKeyword" value="${searchVO.searchKeyword}" /></c:if>
				</c:url>
				<a href="${viewUrl}"><c:out value="${resultInfo.codeNm}"/></a></td>
			<td nowrap><c:if test="${resultInfo.useAt == 'Y'}">사용</c:if><c:if test="${resultInfo.useAt == 'N'}">미사용</c:if></td>
		</tr>   
		</c:forEach>
		
		<c:if test="${fn:length(resultList) == 0}">
			<tr> 
				<td colspan=7>
					<spring:message code="common.nodata.msg" />
				</td>
			</tr>   	          				 			   
		</c:if>
		</tbody>  
	</table>

	<div class="btn_r">
		<c:url var="registerUrl" value="${_PREFIX}/EgovCcmCmmnDetailCodeRegist.do?">
			<c:if test="${not empty searchVO.searchCode}"><c:param name="searchCode" value="${searchVO.searchCode}" /></c:if>
			<c:if test="${not empty searchVO.pageIndex}"><c:param name="pageIndex" value="${searchVO.pageIndex}" /></c:if>
			<c:if test="${not empty searchVO.searchCondition}"><c:param name="searchCondition" value="${searchVO.searchCondition}" /></c:if>
			<c:if test="${not empty searchVO.searchKeyword}"><c:param name="searchKeyword" value="${searchVO.searchKeyword}" /></c:if>
		</c:url>
		<a href="${registerUrl}"><img src="${MNG_IMG}/btn/btn_creat.gif" alt="생성"/></a>
	</div>
	
	<div id="paging">
		<c:url var="pageUrl" value="${_PREFIX}/EgovCcmCmmnDetailCodeList.do?">
			<c:if test="${not empty searchVO.searchCode}"><c:param name="searchCode" value="${searchVO.searchCode}" /></c:if>
			<c:if test="${not empty searchVO.searchCondition}"><c:param name="searchCondition" value="${searchVO.searchCondition}" /></c:if>
			<c:if test="${not empty searchVO.searchKeyword}"><c:param name="searchKeyword" value="${searchVO.searchKeyword}" /></c:if>
		</c:url>
		<ul>
			<ui:pagination paginationInfo="${paginationInfo}" type="image" jsFunction="${pageUrl}" />
		</ul>
	</div>

	<div id="bbs_search">
		<label for="ftext" class="hdn">분류검색</label>
		<select name="searchCondition" class="select">
			<option value=''>선택하세요</option>
			<option value='1' <c:if test="${searchVO.searchCondition eq '1'}">selected="selected"</c:if>>코드ID</option>
			<option value='2' <c:if test="${searchVO.searchCondition eq '2'}">selected="selected"</c:if>>코드</option>
			<option value='3' <c:if test="${searchVO.searchCondition eq '3'}">selected="selected"</c:if>>코드명</option>
		   </select>
		<label for="inp_text" class="hdn">검색어입력</label>
		<input name="searchKeyword" type="text" size="25" class="inp" value='<c:out value="${searchVO.searchKeyword}"/>' maxlength="35"  class="inp_s" id="inp_text"/>
		<input type=image src="${MNG_IMG}/btn/btn_search.gif" alt="검색"/>
	</div>

</form>
</div>

<c:import url="/mng/template/popBottom.do" charEncoding="utf-8"/>
