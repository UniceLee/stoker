/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-07-19 06:09:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import order.model.vo.PageInfo;
import java.text.SimpleDateFormat;
import product.model.vo.Warehousing;
import java.util.List;
import member.model.vo.Employee;
import member.model.service.EmpService;
import member.model.vo.Employee;

public final class warehousing_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/views/product/../common/footerScript.jsp", Long.valueOf(1594450848000L));
    _jspx_dependants.put("/WEB-INF/views/product/../common/navbar.jsp", Long.valueOf(1595008140000L));
    _jspx_dependants.put("/WEB-INF/views/product/../common/footer.jsp", Long.valueOf(1594349126000L));
    _jspx_dependants.put("/WEB-INF/views/product/../common/sidebar.jsp", Long.valueOf(1595039526000L));
    _jspx_dependants.put("/WEB-INF/views/product/../common/meta.jsp", Long.valueOf(1593265000000L));
    _jspx_dependants.put("/WEB-INF/views/product/../common/header.jsp", Long.valueOf(1593330696000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("product.model.vo.Warehousing");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("order.model.vo.PageInfo");
    _jspx_imports_classes.add("member.model.vo.Employee");
    _jspx_imports_classes.add("member.model.service.EmpService");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String contextPath = request.getContextPath();
	List<Warehousing> wList = (List<Warehousing>) request.getAttribute("wList");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
	String[] search = request.getParameterValues("search");

	
	PageInfo pi = (PageInfo) request.getAttribute("pi");
	
	int currentPage = pi.getCurrentPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	int maxPage = pi.getMaxPage();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("\t ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
      out.write("\r\n");
      out.write("\t <title>입고</title>\r\n");
      out.write("\t ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- plugins:css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/vendors/mdi/css/materialdesignicons.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/vendors/css/vendor.bundle.base.css\">\r\n");
      out.write("<!-- endinject -->\r\n");
      out.write("<!-- Plugin css for this page -->\r\n");
      out.write("<!-- End plugin css for this page -->\r\n");
      out.write("<!-- inject:css -->\r\n");
      out.write("<!-- endinject -->\r\n");
      out.write("<!-- Layout styles -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/css/style.css\">\r\n");
      out.write("<!-- End layout styles -->\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/images/favicon.png\" />\r\n");
      out.write("<!-- font 적용-->\r\n");
      out.write("<!-- 한글 폰트 적용 : 해당 태그 클래스에 'kor' 기입 -->\r\n");
      out.write("<!-- font-family: 'Noto Sans KR', sans-serif; -->\r\n");
      out.write("<!-- font-weight은 100, 300, 400(default), 500, 700, 900 가능합니다. -->\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("\t.kor {\r\n");
      out.write("\t\tfont-family: 'Noto Sans KR', sans-serif;\r\n");
      out.write("\t\tcolor: #343A40;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  <style>\r\n");
      out.write("\t#stock-tr{\r\n");
      out.write("\t\t/* font-family: 고딕; */\r\n");
      out.write("\t\tfont-weight: bold;\r\n");
      out.write("\t}\r\n");
      out.write("\t.popup_panel { display: none; position: fixed; top: 0; left: 0; width: 100%; height: 100%; z-index: 100;}\r\n");
      out.write("\t.popup_panel div.popup_bg { position: absolute; top: 0; left: 0; width: 100%; height: 100%; background:#000; opacity:.5; filter:alpha(opacity=50); }\r\n");
      out.write("\t.popup_panel div.popup_contents { position: absolute; top: 30%; left: 50%; width:600px; hight:800px; border:2px solid #b66dff; background-color:#fff; }\r\n");
      out.write("\t.popup_contents2 {display:inline; float: right; margin: 30px; margin-top: 63px; margin-right: 38px;}\r\n");
      out.write("  </style>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container-scroller\">\r\n");
      out.write("\t  ");
      out.write("\r\n");
      out.write("\r\n");
 
	Employee empLoggedIn = (Employee) session.getAttribute("empLoggedIn");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- partial:partials/_navbar.html -->\r\n");
      out.write("<nav class=\"navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row\">\r\n");
      out.write("  <div class=\"text-center navbar-brand-wrapper d-flex align-items-center justify-content-center\">\r\n");
      out.write("    <a class=\"navbar-brand brand-logo\" href=\"");
      out.print( request.getContextPath() );
      out.write("/index.jsp\"><img src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/images/logo.png\" alt=\"logo\" /></a>\r\n");
      out.write("    <a class=\"navbar-brand brand-logo-mini\" href=\"");
      out.print( request.getContextPath() );
      out.write("/index.jsp\"><img src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/images/logo-mini.svg\" alt=\"logo\" /></a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"navbar-menu-wrapper d-flex align-items-stretch\">\r\n");
      out.write("    <button class=\"navbar-toggler navbar-toggler align-self-center\" type=\"button\" data-toggle=\"minimize\">\r\n");
      out.write("      <span class=\"mdi mdi-menu\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"search-field d-none d-md-block\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul class=\"navbar-nav navbar-nav-right\">\r\n");
      out.write("      <li class=\"nav-item nav-profile dropdown\" style=\"margin-top: 2%;\">\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" id=\"profileDropdown\" href=\"#\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("          <div class=\"nav-profile-text\" >\r\n");
      out.write("          ");
if(empLoggedIn != null){
      out.write("\r\n");
      out.write("          <p class=\"mb-1 text-black\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/member/infoView?eCode=");
      out.print(empLoggedIn.geteCode());
      out.write('\'');
      out.write('"');
      out.write('>');
      out.print(empLoggedIn.geteDept()+"팀 담당자  ");
      out.write(" <strong>");
      out.print(empLoggedIn.geteName() );
      out.write("</strong></p>\r\n");
      out.write("          ");
}
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item d-none d-lg-block full-screen-link\">\r\n");
      out.write("        <a class=\"nav-link\">\r\n");
      out.write("          <i class=\"mdi mdi-fullscreen\" id=\"fullscreen-button\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("\t  <li class=\"nav-item\">\r\n");
      out.write("\t    <a class=\"nav-link\" href=\"");
      out.print( request.getContextPath());
      out.write("/board/boardList\">\r\n");
      out.write("\t  \t<i class=\"mdi mdi-bulletin-board\"></i>\r\n");
      out.write("\t    </a>\r\n");
      out.write("\t  </li>\r\n");
      out.write("      <li class=\"nav-item nav-logout d-none d-lg-block\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"");
      out.print( request.getContextPath());
      out.write("/member/logout\">\r\n");
      out.write("          <i class=\"mdi mdi-power\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item nav-settings d-none d-lg-block\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("          <i class=\"mdi mdi-format-line-spacing\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <button class=\"navbar-toggler navbar-toggler-right d-lg-none align-self-center\" type=\"button\" data-toggle=\"offcanvas\">\r\n");
      out.write("      <span class=\"mdi mdi-menu\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("      <!-- partial -->\r\n");
      out.write("      <div class=\"container-fluid page-body-wrapper\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
	Employee user = (Employee) session.getAttribute("empLoggedIn");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- partial:partials/_sidebar.html -->\r\n");
      out.write("<nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\r\n");
      out.write("  <ul class=\"nav\">\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("      <a class=\"nav-link\" href=\"");
      out.print( request.getContextPath() );
      out.write("\">\r\n");
      out.write("        <span class=\"menu-title kor\">메 인</span>\r\n");
      out.write("        <i class=\"mdi mdi-home menu-icon\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("      <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#product\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\r\n");
      out.write("        <span class=\"menu-title kor\">상품관리</span>\r\n");
      out.write("        <i class=\"menu-arrow\"></i>\r\n");
      out.write("        <i class=\"mdi mdi-basket menu-icon\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"collapse\" id=\"product\">\r\n");
      out.write("        <ul class=\"nav flex-column sub-menu\">\r\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link kor\" href=\"");
      out.print( request.getContextPath() );
      out.write("/product/warehousing?currentPage=1\">입고</a></li>\r\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link kor\" href=\"");
      out.print( request.getContextPath() );
      out.write("/product/beReleased\">출고</a></li>\r\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link kor\" href=\"");
      out.print( request.getContextPath() );
      out.write("/product/stk\">재고</a></li> \r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("      <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#order\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\r\n");
      out.write("        <span class=\"menu-title kor\">거래관리</span>\r\n");
      out.write("        <i class=\"menu-arrow\"></i>\r\n");
      out.write("        <i class=\"mdi mdi-barcode-scan menu-icon\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"collapse\" id=\"order\">\r\n");
      out.write("        <ul class=\"nav flex-column sub-menu\">\r\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link kor\" href=\"");
      out.print( request.getContextPath() );
      out.write("/order/ordr?currentPage=1\">발주</a></li>\r\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link kor\" href=\"");
      out.print( request.getContextPath() );
      out.write("/order/transfer\">이송</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("       <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"");
      out.print( request.getContextPath() );
      out.write("/sales\">\r\n");
      out.write("        <span class=\"menu-title kor\">통 계</span>\r\n");
      out.write("        <i class=\"menu-arrow\"></i>\r\n");
      out.write("        <i class=\"mdi mdi-chart-line menu-icon\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("      <a class=\"nav-link\" href=\"");
      out.print( request.getContextPath() );
      out.write("/approval?currentPage=1\">\r\n");
      out.write("        <span class=\"menu-title kor\">결재진행</span>\r\n");
      out.write("        <i class=\"menu-arrow\"></i>\r\n");
      out.write("        <i class=\"mdi mdi-script menu-icon\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("    </li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("        <!-- partial -->\r\n");
      out.write("        <div class=\"main-panel\">\r\n");
      out.write("          <div class=\"content-wrapper\">\r\n");
      out.write("              <i class=\"mdi mdi-close\" id=\"bannerClose\" style=\"display: none;\"></i>\r\n");
      out.write("            <div class=\"page-header\">\r\n");
      out.write("              <h3 class=\"page-title kor\">\r\n");
      out.write("                <span class=\"page-title-icon bg-gradient-primary text-white mr-2\">\r\n");
      out.write("                  <i class=\"mdi mdi-basket\"></i>\r\n");
      out.write("                </span> 입 고 </h3>\r\n");
      out.write("            </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          ");
      out.write("\r\n");
      out.write("          <div class=\"col-12\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                  <div class=\"card-body\">\r\n");
      out.write("                    <form class=\"form-sample\" id=\"searchForm\" action=\"");
      out.print(contextPath);
      out.write("/product/searchWarehousing\">\r\n");
      out.write("                      <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                          <div class=\"form-group row\">\r\n");
      out.write("                            <label class=\"col-sm-3 col-form-label stock-tr\">입고코드</label>\r\n");
      out.write("                            <div class=\"col-sm-9\">\r\n");
      out.write("                              <input type=\"text\" class=\"form-control\" name=\"search\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                          <div class=\"form-group row\">\r\n");
      out.write("                            <label class=\"col-sm-3 col-form-label stock-tr\">입고사유</label>\r\n");
      out.write("                            <div class=\"col-sm-9\">\r\n");
      out.write("                              <input type=\"text\" class=\"form-control\" name=\"search\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                          <div class=\"form-group row\">\r\n");
      out.write("                            <label class=\"col-sm-3 col-form-label stock-tr\">기간</label>\r\n");
      out.write("                            <div class=\"col-sm-9\">\r\n");
      out.write("                             <input type=\"date\" class=\"form-control\" name=\"search\" id=\"r-date\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                          <div class=\"form-group row\" >\r\n");
      out.write("                            <label class=\"col-sm-3 col-form-label stock-tr\" style=\"text-align: center\"> - </label>\r\n");
      out.write("                            <div class=\"col-sm-9\">\r\n");
      out.write("                             <input type=\"date\" class=\"form-control\" name=\"search\" id=\"r-date2\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("       \t                 <button type=\"button\" class=\"btn btn-inverse-info btn-fw\" style=\"float: left\" onclick=\"location.href=location.href='");
      out.print(contextPath);
      out.write("/product/warehousing?currentPage=1'\">전체보기</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("    \t\t\t\t\t  <input type=\"hidden\" name=\"currentPage\" value=\"1\" form=\"searchForm\"/>\r\n");
      out.write("                         <button type=\"submit\" class=\"btn btn-inverse-primary btn-fw\" style=\"float: right\">Search</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("          <div >\r\n");
      out.write("          \t\t\r\n");
      out.write("          \t\r\n");
      out.write("       \r\n");
      out.write("          \t\r\n");
      out.write("          <div >\r\n");
      out.write("          \t\r\n");
      out.write("          <div class=\"col-12 grid-margin\" style=\"margin-top: 26px\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                  <div class=\"card-body\">\r\n");
      out.write("                    <h4 class=\"card-title\">입고내역</h4>\r\n");
      out.write("                    <div class=\"table-responsive\">\r\n");
      out.write("                      <table class=\"table\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <th id=\"stock-tr\"> NO </th>\r\n");
      out.write("                            <th id=\"stock-tr\"> 상품코드 </th>\r\n");
      out.write("                            <th id=\"stock-tr\"> 수량 </th>\r\n");
      out.write("                            <th id=\"stock-tr\"> 입고사유 </th>\r\n");
      out.write("                            <th id=\"stock-tr\"> 센터</th>\r\n");
      out.write("                            <th id=\"stock-tr\"> 입고일</th>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        \r\n");
      out.write("                        <tbody>\r\n");
      out.write("                        ");
 if(wList == null || wList.isEmpty()) { 
      out.write("\r\n");
      out.write("                  \t\t<tr>\r\n");
      out.write("   \t\t\t\t\t\t\t<th colspan=\"6\">조회된 행이 없습니다.</th>\r\n");
      out.write("                  \t\t</tr>\r\n");
      out.write("                       ");
 } else {
                       		for(Warehousing w : wList) {
      out.write("\r\n");
      out.write("                       \t\t\r\n");
      out.write("                         <tr>\r\n");
      out.write("                           <td> ");
      out.print( w.getwCode() );
      out.write(" </td>\r\n");
      out.write("                           <td><a href=\"javascript:void(0)\" class=\"btn_popup_open\" style='color:#b66dff'> ");
      out.print( w.getpCode() );
      out.write("</a></td>\r\n");
      out.write("                           <td> ");
      out.print( w.getwAmount() );
      out.write(" </td>\r\n");
      out.write("                           \r\n");
      out.write("                           ");
 if(w.getwReason().equals("S")) { 
      out.write("\r\n");
      out.write("                           <td> <label class=\"badge badge-gradient-danger\">공장입고</label> </td>\r\n");
      out.write("                           ");
 } else { 
      out.write("\r\n");
      out.write("                           <td> <label class=\"badge badge-gradient-success\">이송입고</label> </td>\r\n");
      out.write("                           ");
 } 
      out.write("\r\n");
      out.write("                           \r\n");
      out.write("                           <td> ");
      out.print( w.getcCode().equals("TK") ? "대구센터" : "경기센터" );
      out.write(" </td>\r\n");
      out.write("                           <td> ");
      out.print( sdf.format(w.getwDate()) );
      out.write(" </td>\r\n");
      out.write("                         </tr>\r\n");
      out.write("                         \r\n");
      out.write("                        ");
 } 
                        } 
      out.write(" \r\n");
      out.write("                        </tbody>\r\n");
      out.write("                      </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <!--  페이징 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"pagingArea\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t");

							if (currentPage != 1) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(contextPath);
      out.write("/product/warehousing?currentPage=1\" style=\"color:#b66dff\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class='mdi mdi-chevron-double-left' style='color:#b66dff'></i>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(contextPath);
      out.write("/product/warehousing?currentPage=");
      out.print(currentPage - 1);
      out.write("\" style=\"color:#b66dff\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"mdi mdi-chevron-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");

							for (int p = startPage; p <= endPage; p++) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");

								if (currentPage != p) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t   ");

									if(search == null) {
						
      out.write(" \r\n");
      out.write("\t\t\t\t\t\t<a href='");
      out.print(contextPath);
      out.write("/product/warehousing?currentPage=");
      out.print(p);
      out.write("' style='color:#b66dff'> ");
      out.print( p );
      out.write(" </a>\r\n");
      out.write("\t\t\t\t\t\t");

									} else {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href='");
      out.print(contextPath);
      out.write("/product/searchWarehousing?currentPage=");
      out.print(p);
      out.write("&search=");
      out.print(search[0]);
      out.write("&search=");
      out.print(search[1]);
      out.write("&search=");
      out.print(search[2]);
      out.write("&search=");
      out.print(search[3]);
      out.write("' style='color:#b66dff'> ");
      out.print( p );
      out.write(" </a>\r\n");
      out.write("\t\t\t\t\t\t");

									}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");

								} else {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<span class='cPage' style='color:#b66dff'>");
      out.print( p );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t");

								}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");

							if(maxPage != 0) 
							{
								if (currentPage != maxPage) 
								{
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(contextPath);
      out.write("/product/warehousing?currentPage=");
      out.print(currentPage + 1);
      out.write("\" style='color:#b66dff'>\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"mdi mdi-chevron-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(contextPath);
      out.write("/product/warehousing?currentPage=");
      out.print(maxPage);
      out.write("\" style='color:#b66dff'>\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"mdi mdi-chevron-double-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t");

								}
							}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- 레이어 팝업 시작 -->\r\n");
      out.write("\t\t\t<div class=\"popup_panel\">\r\n");
      out.write("\t\t\t\t<div class=\"popup_bg\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"popup_contents\" style=\"float: left;\">\r\n");
      out.write("\t\t\t\t\t\t<!-- images 폴더에 p_code와 같은 이름의 jpg파일 -->\r\n");
      out.write("\t\t\t\t\t\t<img id=\"p_image\" src=\"\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t<div class=\"popup_contents2\">\r\n");
      out.write("\t\t\t\t\t\t<!-- db product테이블 p_theme 컬럼 --> \r\n");
      out.write("\t\t\t\t\t\t<span id=\"p_theme\">p_theme</span>\r\n");
      out.write("\t\t\t\t\t\t<!-- db product테이블 p_category 컬럼 -->\r\n");
      out.write("\t\t\t\t\t\t<span id=\"p_category\">p_category</span>\r\n");
      out.write("\t\t\t\t\t\t<!-- db product테이블 p_name 컬럼 -->\r\n");
      out.write("\t\t\t\t\t\t<span id=\"p_name\">p_name</span>\r\n");
      out.write("\t\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"p_price\" style=\"float:right\">p_price</span>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"qrDiv\" style=\"float: right; margin-top: 40px\">\r\n");
      out.write("\t\t\t\t\t\t\t<img id=\"p_qr_image\" src=\"\" alt=\"\" style=\"width:130px; margin-right: -60px;\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("          <!-- content-wrapper ends -->\r\n");
      out.write("    \t   ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- partial:partials/_footer.html -->\r\n");
      out.write("<footer class=\"footer\">\r\n");
      out.write("  <div class=\"d-sm-flex justify-content-center justify-content-sm-between\">\r\n");
      out.write("    <span class=\"text-muted text-center text-sm-left d-block d-sm-inline-block\">Copyright © 2017 <a href=\"#\" target=\"_blank\">STOCKer</a>. All rights reserved.</span>\r\n");
      out.write("    <i class=\"mdi mdi-heart text-danger\" id=\"topBtn\"></i>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("          <!-- partial -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- main-panel ends -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- page-body-wrapper ends -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- container-scroller -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- plugins:js -->\r\n");
      out.write("<script src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/vendors/js/vendor.bundle.base.js\"></script>\r\n");
      out.write("<!-- endinject -->\r\n");
      out.write("<!-- Plugin js for this page -->\r\n");
      out.write("<script src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/vendors/chart.js/Chart.min.js\"></script>\r\n");
      out.write("<!-- End plugin js for this page -->\r\n");
      out.write("<!-- inject:js -->\r\n");
      out.write("<script src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/js/off-canvas.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/js/hoverable-collapse.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/js/misc.js\"></script>\r\n");
      out.write("<!-- endinject -->\r\n");
      out.write("<!-- Custom js for this page -->\r\n");
      out.write("<script src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/js/dashboard.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(  request.getContextPath() );
      out.write("/resources/bootstrap/js/todolist.js\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("  var topEle = $('#topBtn');\r\n");
      out.write("  var delay = 1000;\r\n");
      out.write("  \r\n");
      out.write("  topEle.on('click', function() {\r\n");
      out.write("    $('html, body').stop().animate({scrollTop: 0}, delay);\r\n");
      out.write("  });\r\n");
      out.write("  </script>\r\n");
      out.write("<!-- End custom js for this page -->");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("$(function () {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 레이어팝업 \r\n");
      out.write("\t    var $panel = $(\".popup_panel\");\r\n");
      out.write("\t    var $panelContents = $panel.find(\".popup_contents\");\r\n");
      out.write("\t    \r\n");
      out.write("\t    //상품상세팝업 클릭했을때\r\n");
      out.write("\t    $(\".btn_popup_open\").on(\"click\", function(e) {\r\n");
      out.write("\t    \t//상품코드 준비\r\n");
      out.write("\t    \tvar pCode = $(this).text();\r\n");
      out.write("\t\t\tvar params = {pCode : pCode}; //서버로 보낼 파라미터\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.post('");
      out.print(contextPath);
      out.write("/order/productDetail', $.param(params), function(responseJson){\r\n");
      out.write("\t\t\t\t//p_theme, p_category, p_name, p_price, p_qrImage\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar obj = $.parseJSON(JSON.stringify(responseJson));\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#p_image\").attr(\"src\", obj.pImage); //파일서블릿 경로(상품이미지 서버위치 가져옴)\r\n");
      out.write("\t\t\t\t$(\"#p_theme\").text(\"[\" + obj.pTheme + \"]\");\r\n");
      out.write("\t\t\t\t$(\"#p_category\").text(\"[\" + obj.pCategory + \"]\");\r\n");
      out.write("\t\t\t\t$(\"#p_name\").text(obj.pName);\r\n");
      out.write("\t\t\t\t$(\"#p_price\").text((obj.pPrice).toString().replace(/\\B(?=(\\d{3})+(?!\\d))/g, \",\")); //가격 콤마찍기 \r\n");
      out.write("\t\t\t\t$(\"#p_qr_image\").attr(\"src\", obj.pQrImage); //파일서블릿 경로(상품QR이미지 서버위치 가져옴)\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t        // 팝업 가운데 설정(가로)\r\n");
      out.write("\t        if ($panelContents.outerWidth() < $(document).width()) {\r\n");
      out.write("\t            $panelContents.css(\"margin-left\", \"-\" + $panelContents.outerWidth() / 2 + \"px\");\r\n");
      out.write("\t        } else {\r\n");
      out.write("\t            $panelContents.css(\"left\", \"0px\");\r\n");
      out.write("\t        }\r\n");
      out.write("\r\n");
      out.write("\t        // 팝업 가운데 설정(세로)\r\n");
      out.write("\t        if ($panelContents.outerHeight() < $(document).height()) {\r\n");
      out.write("\t            $panelContents.css(\"margin-top\", \"-\" + $panelContents.outerHeight() / 2 + \"px\");\r\n");
      out.write("\t        } else {\r\n");
      out.write("\t            $panelContents.css(\"top\", \"0px\");\r\n");
      out.write("\t        }\r\n");
      out.write("\t        // 레이어 팝업 열기\r\n");
      out.write("\t        $panel.fadeIn();\r\n");
      out.write("\t        \r\n");
      out.write("\t    });\r\n");
      out.write("\t    // 팝업 닫기 이벤트 정의\r\n");
      out.write("\t    $(\"#btn_popup_close\").on(\"click\", popupClose);\r\n");
      out.write("\r\n");
      out.write("\t    // 팝업 배경 클릭 이벤트 정의\r\n");
      out.write("\t    $panel.find(\".popup_bg\").on(\"click\", popupClose);\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction popupClose(e) {\r\n");
      out.write("\t\t    $panel.fadeOut();\r\n");
      out.write("\t\t    // 이벤트 기본 동작 중단\r\n");
      out.write("\t\t    e.preventDefault();\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
