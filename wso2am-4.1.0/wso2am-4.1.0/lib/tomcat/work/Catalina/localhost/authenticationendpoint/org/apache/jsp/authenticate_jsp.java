/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2023-08-01 05:41:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.collections.MapUtils;
import org.owasp.encoder.Encode;
import org.wso2.carbon.identity.application.authentication.endpoint.util.client.AuthAPIServiceClient;
import org.wso2.carbon.identity.application.authentication.endpoint.util.client.model.AuthenticationErrorResponse;
import org.wso2.carbon.identity.application.authentication.endpoint.util.client.model.AuthenticationResponse;
import org.wso2.carbon.identity.application.authentication.endpoint.util.client.model.AuthenticationSuccessResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import static org.wso2.carbon.identity.application.authentication.endpoint.util.Constants.STATUS;
import static org.wso2.carbon.identity.application.authentication.endpoint.util.Constants.AUTHENTICATION_MECHANISM_NOT_CONFIGURED;
import static org.wso2.carbon.identity.application.authentication.endpoint.util.Constants.STATUS_MSG;
import static org.wso2.carbon.identity.application.authentication.endpoint.util.Constants.CONFIGURATION_ERROR;
import static org.wso2.carbon.identity.application.authentication.endpoint.util.Constants.ERROR_CODE;
import static org.wso2.carbon.identity.application.authentication.endpoint.util.Constants.ERROR_MSG;
import static org.wso2.carbon.identity.application.authentication.endpoint.util.Constants.SESSION_DATA_KEY;
import static org.wso2.carbon.identity.application.authentication.endpoint.util.Constants.AUTHENTICATION_REST_ENDPOINT_URL;
import java.io.File;
import java.util.ResourceBundle;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil;
import org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl;
import java.nio.charset.StandardCharsets;
import org.apache.commons.lang.StringUtils;
import org.wso2.carbon.identity.core.util.IdentityTenantUtil;

public final class authenticate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/includes/init-url.jsp", Long.valueOf(1645440728000L));
    _jspx_dependants.put("/includes/localize.jsp", Long.valueOf(1645440728000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("static org.wso2.carbon.identity.application.authentication.endpoint.util.Constants.AUTHENTICATION_REST_ENDPOINT_URL");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.client.model.AuthenticationSuccessResponse");
    _jspx_imports_classes.add("org.apache.commons.lang.StringUtils");
    _jspx_imports_classes.add("org.apache.commons.collections.MapUtils");
    _jspx_imports_classes.add("static org.wso2.carbon.identity.application.authentication.endpoint.util.Constants.ERROR_MSG");
    _jspx_imports_classes.add("static org.wso2.carbon.identity.application.authentication.endpoint.util.Constants.SESSION_DATA_KEY");
    _jspx_imports_classes.add("static org.wso2.carbon.identity.application.authentication.endpoint.util.Constants.STATUS_MSG");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl");
    _jspx_imports_classes.add("static org.wso2.carbon.identity.application.authentication.endpoint.util.Constants.AUTHENTICATION_MECHANISM_NOT_CONFIGURED");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil");
    _jspx_imports_classes.add("static org.wso2.carbon.identity.application.authentication.endpoint.util.Constants.ERROR_CODE");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.nio.charset.StandardCharsets");
    _jspx_imports_classes.add("org.owasp.encoder.Encode");
    _jspx_imports_classes.add("java.util.ResourceBundle");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.client.model.AuthenticationResponse");
    _jspx_imports_classes.add("static org.wso2.carbon.identity.application.authentication.endpoint.util.Constants.CONFIGURATION_ERROR");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.client.AuthAPIServiceClient");
    _jspx_imports_classes.add("java.util.StringTokenizer");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("static org.wso2.carbon.identity.application.authentication.endpoint.util.Constants.STATUS");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.client.model.AuthenticationErrorResponse");
    _jspx_imports_classes.add("org.wso2.carbon.identity.core.util.IdentityTenantUtil");
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String BUNDLE = "org.wso2.carbon.identity.application.authentication.endpoint.i18n.Resources";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale(), new
            EncodedControl(StandardCharsets.UTF_8.toString()));

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String identityServerEndpointContextParam = application.getInitParameter("IdentityServerEndpointContextURL");
    String samlssoURL = "../samlsso";
    String commonauthURL = "../commonauth";
    String oauth2AuthorizeURL = "../oauth2/authorize";
    String oidcLogoutURL = "../oidc/logout";
    String openidServerURL = "../openidserver";
    String logincontextURL = "../logincontext";
    if (StringUtils.isNotBlank(identityServerEndpointContextParam)) {
        samlssoURL = identityServerEndpointContextParam + "/samlsso";
        commonauthURL = identityServerEndpointContextParam + "/commonauth";
        oauth2AuthorizeURL = identityServerEndpointContextParam + "/oauth2/authorize";
        oidcLogoutURL = identityServerEndpointContextParam + "/oidc/logout";
        openidServerURL = identityServerEndpointContextParam + "/oidc/logout";
        logincontextURL = identityServerEndpointContextParam + "/logincontext";
    }
    
    String tenantDomain;
    if (IdentityTenantUtil.isTenantQualifiedUrlsEnabled()) {
        tenantDomain = IdentityTenantUtil.getTenantDomainFromContext();
    } else {
        tenantDomain = request.getParameter("tenantDomain");
    }

      out.write('\n');
      out.write('\n');
      out.write('\n');

    String sessionDataKey = request.getParameter(SESSION_DATA_KEY);
    String token = "";
    String authAPIURL = application.getInitParameter(AUTHENTICATION_REST_ENDPOINT_URL);
    if (StringUtils.isNotBlank(authAPIURL)) {

        AuthAPIServiceClient authAPIServiceClient = new AuthAPIServiceClient(authAPIURL);
        AuthenticationResponse authenticationResponse = authAPIServiceClient.authenticate(request.getParameter("username"), request.getParameter("password"));
        if (authenticationResponse instanceof AuthenticationSuccessResponse) {

            AuthenticationSuccessResponse successResponse = (AuthenticationSuccessResponse) authenticationResponse;
            token = successResponse.getToken();
        } else {

            // Populate a key value map from the query string received.
            Map<String, String> queryParamMap = new HashMap<String, String>();
            String queryString = request.getQueryString();
            if (StringUtils.isNotBlank(queryString)) {
                StringTokenizer stringTokenizer = new StringTokenizer(queryString, "&");
                while (stringTokenizer.hasMoreTokens()) {
                    String queryParam = stringTokenizer.nextToken();
                    String[] queryParamKeyValueArray = queryParam.split("=", 2);
                    queryParamMap.put(queryParamKeyValueArray[0], queryParamKeyValueArray[1]);
                }
            }

            AuthenticationErrorResponse errorResponse = (AuthenticationErrorResponse) authenticationResponse;
            // Update the query parameter map with the parameters received in error response.
            StringBuilder queryStringBuilder = new StringBuilder();
            if (MapUtils.isNotEmpty(errorResponse.getProperties())) {
                Map<String, String> propertyMap = errorResponse.getProperties();
                for (Map.Entry<String, String> entry : propertyMap.entrySet()) {
                    queryParamMap.put(Encode.forUriComponent(entry.getKey()), Encode.forUriComponent(entry.getValue()));
                }
            }

            queryParamMap.put(ERROR_CODE, Encode.forUriComponent(errorResponse.getCode()));
            queryParamMap.put(ERROR_MSG, Encode.forUriComponent(errorResponse.getMessage()));

            // Re-build query string
            int count = 0;
            for (Map.Entry<String, String> entry : queryParamMap.entrySet()) {
                queryStringBuilder.append(entry.getKey()).append("=").append(entry.getValue());
                count++;
                if (count < queryParamMap.size()) {
                    queryStringBuilder.append("&");
                }
            }
            String newQueryString = queryStringBuilder.toString();

            String redirectURL = "login.do";
            if (StringUtils.isNotBlank(newQueryString)) {
                redirectURL = redirectURL + "?" + newQueryString;
            }
            response.sendRedirect(redirectURL);
            return;
        }
    } else {
        String redirectURL = "error.do?" + STATUS + "=" + CONFIGURATION_ERROR + "&" + STATUS_MSG + "=" + AUTHENTICATION_MECHANISM_NOT_CONFIGURED;
        response.sendRedirect(redirectURL);
        return;
    }

      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <!-- header -->\n");
      out.write("    ");

        File headerFile = new File(getServletContext().getRealPath("extensions/header.jsp"));
        if (headerFile.exists()) {
    
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/header.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"login-portal layout authentication-portal-layout\">\n");
      out.write("    <main class=\"center-segment\">\n");
      out.write("        <div class=\"ui container large center aligned middle aligned\">\n");
      out.write("\n");
      out.write("            <!-- product-title -->\n");
      out.write("            ");

                File productTitleFile = new File(getServletContext().getRealPath("extensions/product-title.jsp"));
                if (productTitleFile.exists()) {
            
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/product-title.jsp", out, false);
      out.write("\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/product-title.jsp", out, false);
      out.write("\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"ui segment\">\n");
      out.write("                <p>");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "you.are.redirected.back.to"));
      out.write(' ');
      out.print(commonauthURL);
      out.write("\n");
      out.write("                    ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "if.the.redirection.fails.please.click"));
      out.write(".</p>\n");
      out.write("\n");
      out.write("                <form method=\"post\" action=\"");
      out.print(commonauthURL);
      out.write("\">\n");
      out.write("                    <input id=\"token\" name=\"token\" type=\"hidden\" value=\"");
      out.print(Encode.forHtmlAttribute(token));
      out.write("\">\n");
      out.write("                    <input id=\"sessionDataKey\" name=\"sessionDataKey\" type=\"hidden\" value=\"");
      out.print(Encode.forHtmlAttribute(sessionDataKey));
      out.write("\">\n");
      out.write("                    <button type=\"submit\" class=\"ui primary large button\">");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "post"));
      out.write("</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <!-- product-footer -->\n");
      out.write("    ");

        File productFooterFile = new File(getServletContext().getRealPath("extensions/product-footer.jsp"));
        if (productFooterFile.exists()) {
    
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/product-footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/product-footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    <!-- footer -->\n");
      out.write("    ");

        File footerFile = new File(getServletContext().getRealPath("extensions/footer.jsp"));
        if (footerFile.exists()) {
    
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    <script type='text/javascript'>\n");
      out.write("        document.forms[0].submit();\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
