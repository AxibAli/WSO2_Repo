/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2023-08-01 11:18:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.ui.CarbonUIUtil;
import java.net.URL;
import org.wso2.carbon.utils.multitenancy.MultitenantConstants;
import org.wso2.carbon.utils.CarbonUtils;
import org.wso2.carbon.ui.util.UIAnnouncementDeployer;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/tlds/fmt.tld", Long.valueOf(1647580036000L));
    _jspx_dependants.put("/admin/layout/announcements.jsp", Long.valueOf(1647580036000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.wso2.carbon.utils.multitenancy.MultitenantConstants");
    _jspx_imports_classes.add("org.wso2.carbon.utils.CarbonUtils");
    _jspx_imports_classes.add("java.net.URL");
    _jspx_imports_classes.add("org.wso2.carbon.ui.util.UIAnnouncementDeployer");
    _jspx_imports_classes.add("org.wso2.carbon.ui.CarbonUIUtil");
    _jspx_imports_classes.add("org.wso2.carbon.CarbonConstants");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;

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
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String userGuideURL = (String) config.getServletContext().getAttribute(CarbonConstants.PRODUCT_XML_WSO2CARBON +
                                                                           CarbonConstants.PRODUCT_XML_USERGUIDE);
    if(userGuideURL == null){
        userGuideURL = "#";
    }

	String serverURL = (String) session.getAttribute(CarbonConstants.SERVER_URL);
    if (serverURL == null) {
        serverURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
        session.setAttribute(CarbonConstants.SERVER_URL, serverURL);
    }


      out.write("\n");
      out.write("<!--[IF IE 7]>\n");
      out.write("	<style>\n");
      out.write("		div#header-div div.right-links{\n");
      out.write("			position:absolute;\n");
      out.write("		}\n");
      out.write("	</style>\n");
      out.write("<![endif]-->\n");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_005fbundle_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      boolean _jspx_th_fmt_005fbundle_005f0_reused = false;
      try {
        _jspx_th_fmt_005fbundle_005f0.setPageContext(_jspx_page_context);
        _jspx_th_fmt_005fbundle_005f0.setParent(null);
        // /admin/layout/header.jsp(47,0) name = basename type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_fmt_005fbundle_005f0.setBasename("org.wso2.carbon.i18n.Resources");
        int _jspx_eval_fmt_005fbundle_005f0 = _jspx_th_fmt_005fbundle_005f0.doStartTag();
        if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_fmt_005fbundle_005f0);
          }
          do {
            out.write("\n");
            out.write("\n");
            out.write("    <div id=\"header-div\">\n");
            out.write("        <div class=\"right-logo\">");
            if (_jspx_meth_fmt_005fmessage_005f0(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</div>\n");
            out.write("        <div class=\"left-logo\">\n");
            out.write("            <a href=\"../admin/index.jsp\" class=\"header-home\"><img src=\"../admin/images/1px.gif\" width=\"300px\" height=\"32px\"/></a>\n");
            out.write("        </div>\n");
            out.write("        <div class=\"middle-ad\">\n");
            out.write("            ");
            out.write('\n');
            out.write('\n');
            out.write('\n');


    String announcementContent = UIAnnouncementDeployer.getAnnouncementHtml(session, config);


            out.write('\n');
            out.print(announcementContent);
            out.write("\n");
            out.write("        </div>\n");
            out.write("        <div class=\"header-links\">\n");
            out.write("		<div class=\"right-links\">            \n");
            out.write("			<ul>\n");
            out.write("		                ");

		                    Boolean authenticated = (Boolean) request.getSession().getAttribute("authenticated");
		                    if (authenticated != null && authenticated.booleanValue()) {
		                        String signedInAs = (String) request.getSession().getAttribute("logged-user");
//		                        String serverURL = (String) request.getSession().getAttribute(CarbonConstants.SERVER_URL);
		                        String domainName = (String) request.getSession().getAttribute(MultitenantConstants.TENANT_DOMAIN);
		                        // Now that super.tenant domain is carbon.super we are showing the domain name itself.
                                // showing localhost makes no-sense when local transport is enabled and accessed from
                                // a remote browser
		                        /*if (domainName == null ||
		                        		MultitenantConstants.SUPER_TENANT_DOMAIN_NAME.equals(domainName)) {
                                    //TODO Hack checking whether this is the local transport.
                                    if(serverURL.startsWith("local")){
                                        domainName = "localhost";
                                    } else {
                                        URL url = new URL(serverURL);

                                        // this is the super tenant, we are showing the host name instead of the domain name,
                                        domainName = url.getHost();
                                        int port = url.getPort();
                                        if (port != -1) {
                                            domainName += ":" + port;
                                        }
                                    }
		                        } */
                                if (CarbonUIUtil.isContextRegistered(config, "/worklist/")) {
		                
            out.write("\n");
            out.write("                        ");
            org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../worklist/header.jsp", out, false);
            out.write("\n");
            out.write("                        ");

                                }
                        
            out.write("\n");
            out.write("                        ");

                            if (authenticated != null && authenticated.booleanValue() && 
                                MultitenantConstants.SUPER_TENANT_DOMAIN_NAME.equals(domainName)) {
                                if (!CarbonUtils.isRunningOnLocalTransportMode()) {
                                    String remoteServerURL = (String) request.getSession().getAttribute(CarbonConstants.SERVER_URL);
                                    /*server url comes in the form: https://localhost:9443/services/
                                     we need to make it localhost:9443 and display in the header
                                     */
                                    if (remoteServerURL != null) {
                                        URL remoteURL = new URL(remoteServerURL);
                                        String host = remoteURL.getHost();
                                        int port = remoteURL.getPort();
                                        if (host != null && port > 0) {
                                            remoteServerURL = host + ":" + port;
                                       }
                                        String frontEndServerURL = CarbonUIUtil.getAdminConsoleURL(request);
                                        if (frontEndServerURL != null) {
                                            URL localURL = new URL(frontEndServerURL);
                                            String frontEndHost = localURL.getHost();
                                            int frontEndPort = localURL.getPort();
                                            if (frontEndHost != null && frontEndPort > 0) {
                                                frontEndServerURL = frontEndHost + ":" + frontEndPort;
                                            }
                                        }
                                        if (!remoteServerURL.equals(frontEndServerURL)) {
   
                        
            out.write("\n");
            out.write("                                <li class=\"middle\">\n");
            out.write("                                    <label id=\"logged-user\">\n");
            out.write("                                        <strong>");
            if (_jspx_meth_fmt_005fmessage_005f1(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write(":</strong>&nbsp;");
            out.print(remoteServerURL);
            out.write("\n");
            out.write("                                    </label>\n");
            out.write("                                </li>\n");
            out.write("                                <li class=\"middle\">|</li>\n");
            out.write("                        ");

                                        }
                                    }
                                }
                            }
                        
            out.write("\n");
            out.write("\n");
            out.write("		                <li class=\"middle\">\n");
            out.write("		                    <label id=\"logged-user\">\n");
            out.write("		                        <strong>");
            if (_jspx_meth_fmt_005fmessage_005f2(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write(":</strong>&nbsp;");
            out.print(signedInAs);
            out.write('@');
            out.print(domainName);
            out.write("\n");
            out.write("		                    </label>\n");
            out.write("		                </li>\n");
            out.write("				<li class=\"middle\">|</li>\n");
            out.write("		                <li class=\"right\">\n");
            out.write("		                    <a href=\"../admin/logout_action.jsp\">");
            if (_jspx_meth_fmt_005fmessage_005f3(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</a>\n");
            out.write("		                </li>\n");
            out.write("		                ");
  } else { 
            out.write("\n");
            out.write("		                <li class=\"right\">\n");
            out.write("		                    <a href=\"../admin/login.jsp\">");
            if (_jspx_meth_fmt_005fmessage_005f4(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</a>\n");
            out.write("		                </li>\n");
            out.write("		                ");
  } 
            out.write("\n");
            out.write("		                <li class=\"middle\">|</li>\n");
            out.write("		                <li class=\"middle\">\n");
            out.write("		                    <a target=\"_blank\" href=\"");
            out.print(userGuideURL );
            out.write('"');
            out.write('>');
            if (_jspx_meth_fmt_005fmessage_005f5(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</a>\n");
            out.write("		                </li>\n");
            out.write("				<li class=\"middle\">|</li>\n");
            out.write("				");

				String aboutPageURL = "";
				if(CarbonUIUtil.isContextRegistered(config,"/product/")){
					aboutPageURL = "../product/about.html";
				}else{
					//switch to carbon about page
					aboutPageURL = "../docs/about.html";
				}
				
            out.write("\n");
            out.write("		                <li class=\"left\">\n");
            out.write("		                    <a target=\"_blank\" href=\"");
            out.print(aboutPageURL );
            out.write('"');
            out.write('>');
            if (_jspx_meth_fmt_005fmessage_005f6(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</a>\n");
            out.write("		                </li>\n");
            out.write("		            </ul>\n");
            out.write("		</div>\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            int evalDoAfterBody = _jspx_th_fmt_005fbundle_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
          }
        }
        if (_jspx_th_fmt_005fbundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.reuse(_jspx_th_fmt_005fbundle_005f0);
        _jspx_th_fmt_005fbundle_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fbundle_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fbundle_005f0_reused);
      }
      out.write('\n');
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

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f0_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /admin/layout/header.jsp(50,32) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setKey("management.console");
      int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      _jspx_th_fmt_005fmessage_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f1_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /admin/layout/header.jsp(120,48) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f1.setKey("remote.server.url");
      int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
      _jspx_th_fmt_005fmessage_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f1, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f2_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /admin/layout/header.jsp(133,34) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f2.setKey("signed.in.as");
      int _jspx_eval_fmt_005fmessage_005f2 = _jspx_th_fmt_005fmessage_005f2.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
      _jspx_th_fmt_005fmessage_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f2, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f3_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f3.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /admin/layout/header.jsp(138,59) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f3.setKey("sign.out");
      int _jspx_eval_fmt_005fmessage_005f3 = _jspx_th_fmt_005fmessage_005f3.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f3);
      _jspx_th_fmt_005fmessage_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f3, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f4_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f4.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /admin/layout/header.jsp(142,51) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f4.setKey("sign.in");
      int _jspx_eval_fmt_005fmessage_005f4 = _jspx_th_fmt_005fmessage_005f4.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
      _jspx_th_fmt_005fmessage_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f4, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f5_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f5.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /admin/layout/header.jsp(147,67) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f5.setKey("docs");
      int _jspx_eval_fmt_005fmessage_005f5 = _jspx_th_fmt_005fmessage_005f5.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
      _jspx_th_fmt_005fmessage_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f5, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f6_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f6.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /admin/layout/header.jsp(160,67) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f6.setKey("about");
      int _jspx_eval_fmt_005fmessage_005f6 = _jspx_th_fmt_005fmessage_005f6.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f6);
      _jspx_th_fmt_005fmessage_005f6_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f6, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f6_reused);
    }
    return false;
  }
}
