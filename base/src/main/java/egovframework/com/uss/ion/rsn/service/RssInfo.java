package egovframework.com.uss.ion.rsn.service;

import java.io.Serializable;

import egovframework.com.cmm.ComDefaultVO;


/**
 * RSS서비스 Model and VO Class 구현
 * @author 공통서비스 장동한
 * @since 2010.06.16
 * @version 1.0
 * @see <pre>
 * &lt;&lt; 개정이력(Modification Information) &gt;&gt;
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.07.03  장동한          최초 생성
 * 
 * </pre>
 */
@SuppressWarnings("serial")
public class RssInfo extends ComDefaultVO implements Serializable{

	/** RSS태그관리 아이디 */
	private String rssId;
	
	/** 게시판 아이디 */
	private String bbsId;
	
	/** ASP 코드 */
	private String aspCode;
	
	/** 서비스명 */
	private String trgetSvcNm;
	
	/** 서비스TABLE */
	private String trgetSvcTable;
	
	/** 헤더 TITLE */
	private String hderTitle;
	
	/** 헤더	LINK */
	private String hderLink;
	
	/** 헤더 DESCRIPTION */
	private String hderDescription;
	
	/** 헤더 TAG */
	private String hderTag;
	
	/** 헤더 ETC */
	private String hderEtc;
	
	/** 본문 TITLE */
	private String bdtTitle;
	
	/** 본문 LINK */
	private String bdtLink;
	
	/** 본문 DESCRIPTION */
	private String bdtDescription;
	
	/** 본문 TAG */
	private String bdtTag;
	
	/** 본문 ETC */
	private String bdtEtc;
	
    /** 최초등록시점 */
    private String frstRegisterPnttm;

    /** 최초등록아이디 */
    private String frstRegisterId;

    /** 최종수정일 */
    private String lastUpdusrPnttm;

    /** 최종수정자 아이디 */
    private String lastUpdusrId;

	/**
	 * @return the rssId
	 */
	public String getRssId() {
		return rssId;
	}
	
	/**
	 * @param rssId the rssId to set
	 */
	public void setRssId(String rssId) {
		this.rssId = rssId;
	}
	
	/**
	 * bbsId attribute를 리턴한다.
	 * @return  the bbsId
	 * @uml.property  name="bbsId"
	 */
	public String getBbsId() {
		return bbsId;
	}

	/**
	 * bbsId attribute 값을 설정한다.
	 * @param bbsId  the bbsId to set
	 * @uml.property  name="bbsId"
	 */
	public void setBbsId(String bbsId) {
		this.bbsId = bbsId;
	}
	
	/**
	 * aspCode attribute를 리턴한다.
	 * @return  the aspCode
	 * @uml.property  name="aspCode"
	 */
	public String getAspCode() {
		return aspCode;
	}

	/**
	 * aspCode attribute 값을 설정한다.
	 * @param aspCode  the aspCode to set
	 * @uml.property  name="aspCode"
	 */
	public void setAspCode(String aspCode) {
		this.aspCode = aspCode;
	}

	/**
	 * @return the trgetSvcNm
	 */
	public String getTrgetSvcNm() {
		return trgetSvcNm;
	}

	/**
	 * @param trgetSvcNm the trgetSvcNm to set
	 */
	public void setTrgetSvcNm(String trgetSvcNm) {
		this.trgetSvcNm = trgetSvcNm;
	}

	/**
	 * @return the trgetSvcTable
	 */
	public String getTrgetSvcTable() {
		return trgetSvcTable;
	}

	/**
	 * @param trgetSvcTable the trgetSvcTable to set
	 */
	public void setTrgetSvcTable(String trgetSvcTable) {
		this.trgetSvcTable = trgetSvcTable;
	}

	/**
	 * @return the hderTitle
	 */
	public String getHderTitle() {
		return hderTitle;
	}

	/**
	 * @param hderTitle the hderTitle to set
	 */
	public void setHderTitle(String hderTitle) {
		this.hderTitle = hderTitle;
	}

	/**
	 * @return the hderLink
	 */
	public String getHderLink() {
		return hderLink;
	}

	/**
	 * @param hderLink the hderLink to set
	 */
	public void setHderLink(String hderLink) {
		this.hderLink = hderLink;
	}

	/**
	 * @return the hderDescription
	 */
	public String getHderDescription() {
		return hderDescription;
	}

	/**
	 * @param hderDescription the hderDescription to set
	 */
	public void setHderDescription(String hderDescription) {
		this.hderDescription = hderDescription;
	}

	/**
	 * @return the hderTag
	 */
	public String getHderTag() {
		return hderTag;
	}

	/**
	 * @param hderTag the hderTag to set
	 */
	public void setHderTag(String hderTag) {
		this.hderTag = hderTag;
	}

	/**
	 * @return the hderEtc
	 */
	public String getHderEtc() {
		return hderEtc;
	}

	/**
	 * @param hderEtc the hderEtc to set
	 */
	public void setHderEtc(String hderEtc) {
		this.hderEtc = hderEtc;
	}

	/**
	 * @return the bdtTitle
	 */
	public String getBdtTitle() {
		return bdtTitle;
	}

	/**
	 * @param bdtTitle the bdtTitle to set
	 */
	public void setBdtTitle(String bdtTitle) {
		this.bdtTitle = bdtTitle;
	}

	/**
	 * @return the bdtLink
	 */
	public String getBdtLink() {
		return bdtLink;
	}

	/**
	 * @param bdtLink the bdtLink to set
	 */
	public void setBdtLink(String bdtLink) {
		this.bdtLink = bdtLink;
	}

	/**
	 * @return the bdtDescription
	 */
	public String getBdtDescription() {
		return bdtDescription;
	}

	/**
	 * @param bdtDescription the bdtDescription to set
	 */
	public void setBdtDescription(String bdtDescription) {
		this.bdtDescription = bdtDescription;
	}

	/**
	 * @return the bdtTag
	 */
	public String getBdtTag() {
		return bdtTag;
	}

	/**
	 * @param bdtTag the bdtTag to set
	 */
	public void setBdtTag(String bdtTag) {
		this.bdtTag = bdtTag;
	}

	/**
	 * @return the bdtEtc
	 */
	public String getBdtEtc() {
		return bdtEtc;
	}

	/**
	 * @param bdtEtc the bdtEtc to set
	 */
	public void setBdtEtc(String bdtEtc) {
		this.bdtEtc = bdtEtc;
	}

	/**
	 * @return the frstRegisterPnttm
	 */
	public String getFrstRegisterPnttm() {
		return frstRegisterPnttm;
	}

	/**
	 * @param frstRegisterPnttm the frstRegisterPnttm to set
	 */
	public void setFrstRegisterPnttm(String frstRegisterPnttm) {
		this.frstRegisterPnttm = frstRegisterPnttm;
	}

	/**
	 * @return the frstRegisterId
	 */
	public String getFrstRegisterId() {
		return frstRegisterId;
	}

	/**
	 * @param frstRegisterId the frstRegisterId to set
	 */
	public void setFrstRegisterId(String frstRegisterId) {
		this.frstRegisterId = frstRegisterId;
	}

	/**
	 * @return the lastUpdusrPnttm
	 */
	public String getLastUpdusrPnttm() {
		return lastUpdusrPnttm;
	}

	/**
	 * @param lastUpdusrPnttm the lastUpdusrPnttm to set
	 */
	public void setLastUpdusrPnttm(String lastUpdusrPnttm) {
		this.lastUpdusrPnttm = lastUpdusrPnttm;
	}

	/**
	 * @return the lastUpdusrId
	 */
	public String getLastUpdusrId() {
		return lastUpdusrId;
	}

	/**
	 * @param lastUpdusrId the lastUpdusrId to set
	 */
	public void setLastUpdusrId(String lastUpdusrId) {
		this.lastUpdusrId = lastUpdusrId;
	}

    
    
}