/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat9
 * Generated at: 2022-01-11 03:41:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StudentReport_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/home/lokers/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/views/./base.jsp", Long.valueOf(1641787267461L));
    _jspx_dependants.put("file:/home/lokers/.m2/repository/org/springframework/spring-webmvc/5.3.14/spring-webmvc-5.3.14.jar", Long.valueOf(1640836279695L));
    _jspx_dependants.put("file:/home/lokers/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1639560353120L));
    _jspx_dependants.put("jar:file:/home/lokers/.m2/repository/org/springframework/spring-webmvc/5.3.14/spring-webmvc-5.3.14.jar!/META-INF/spring.tld", Long.valueOf(1639623998000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n<title>Student page</title>\n<meta charset=\"ISO-8859-1\">\n");
      out.write("\n\n\n\n\n\n\n\n\n ");
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      out.write("\n<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url_jqlib}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> </script>\n\n\n\n\n<meta name=\"viewport\"\n\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n\n<link rel=\"stylesheet\"\n\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\n\tintegrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\n\tcrossorigin=\"anonymous\">\n\n ");
      out.write("\n\t\n<script \n\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\n\tintegrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n\tcrossorigin=\"anonymous\"></script>\n<script\n\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\n\tintegrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\n\tcrossorigin=\"anonymous\"></script>\n\n<title>");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("</title>");
      out.write("\n\n<script>\n\t$(document).ready(function() {\n\t\t\n\t\t\n\t\tgetAllrecord();\n\t\t\n\t\t$('#saveStudent').show();\n\t\t$('#updateStudent').hide();\n\t\t$('#idField').hide();\n\t\t\n\t\t$('#gettime').click(function() {\n\t\t\t$.ajax({\n\t\t\t\turl : 'date',\n\t\t\t\tsuccess : function(data) {\n\t\t\t\t\t$('#printtime').html(data);\n\t\t\t\t}\n\t\t\t});\n\t\t});\n\t\t\n\t\t$('#saveStudent').click(function() {\n\t\t\t$.ajax({\n\t\t\t\ttype : \"POST\",\n\t\t\t\turl : \"insertStudent\",\n\t\t\t\tdata : {\n\t\t\t\t\tname : $(\"#name\").val(),\n\t\t\t\t\tage : $(\"#age\").val(),\n\t\t\t\t\tcourse : $(\"#course\").val()\n\t\t\t\t},\n\t\t\t\tsuccess : function(result) {\n\t\t\t\t\tgetAllrecord();\n\t\t\t\t\t$('#studentForm')[0].reset()\n\t\t\t\t},\n\t\t\t\terror : function(err) {\n\t\t\t\t\talert(\"error is\" + err)\n\t\t\t\t}\n\t\t\t});\n\n\t\t});\n\n\t});\t\t\n\t\n\tvar data = \"\";\n\tfunction getAllrecord() {\n\t\t$\n\t\t\t\t.ajax({\n\t\t\t\t\ttype : \"GET\",\n\t\t\t\t\turl : \"getAllStudent\",\n\t\t\t\t\tsuccess : function(response) {\n\t\t\t\t\t\t data = response\n\t\t\t\t\t\t \n\t\t\t\t\t\t $('.tr').remove();\n\t\t\t\t\t\tfor (i = 0; i < data.length; i++) {\n\t\t\t\t\t\t\t$(\"#studentTable\")\n\t\t\t\t\t\t\t\t\t.append(\n\t\t\t\t\t\t\t\t\t\t\t'<tr class=\"tr\"> <td>'\n\t\t\t\t\t\t\t\t\t\t\t\t\t+ data[i].id\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ '</td> <td>'\n\t\t\t\t\t\t\t\t\t\t\t\t\t+ data[i].name\n\t\t\t\t\t\t\t\t\t\t\t\t\t+ '</td> <td>'\n\t\t\t\t\t\t\t\t\t\t\t\t\t+ data[i].age\n\t\t\t\t\t\t\t\t\t\t\t\t\t+ '</td> <td>'\n\t\t\t\t\t\t\t\t\t\t\t\t\t+ data[i].course\n\t\t\t\t\t\t\t\t\t\t\t\t\t+ '</td> <td><input type=\"button\" class=\"btn btn-warning\" onclick=\"editStudent('\n\t\t\t\t\t\t\t\t\t\t\t\t\t+ data[i].id\n\t\t\t\t\t\t\t\t\t\t\t\t\t+ ')\"  value=\"Edit\"></input></td> <td> <input type=\"button\" class=\"btn btn-danger\" onclick=\"deleteStudent('\n\t\t\t\t\t\t\t\t\t\t\t\t\t+ data[i].id\n\t\t\t\t\t\t\t\t\t\t\t\t\t+ ');\" value=\"Delete\"></input></td> </tr>');\n\n\t\t\t\t\t\t}\n\n\t\t\t\t\t},\n\t\t\t\t\terror : function(err) {\n\t\t\t\t\t\talert(\"error is\" + err)\n\t\t\t\t\t}\n\t\t\t\t});\n\t}\n\n\t\n\t\n\tfunction editStudent(id) {\n\t\t$.ajax({\n\t\t\ttype : \"GET\",\n\t\t\turl : \"getOneStudent/\" + id,\n\t\t\tdataType : 'json',\n\t\t\tsuccess : function(response) {\n\n\t\t\t\t//alert(\"student--\"+response.id);\n\t\t\t\t$(\"#id\").val(response.id), $(\"#name\").val(response.name), $(\n\t\t\t\t\t\t\"#age\").val(response.age), $(\"#course\").val(\n\t\t\t\t\t\tresponse.course)\n\n\t\t\t\t$('#saveStudent').hide();\n\t\t\t\t$('#updateStudent').show();\n\t\t\t\t$('#idField').show();\n\t\t\t},\n\t\t\terror : function(err) {\n");
      out.write("\t\t\t\talert(\"error is\" + err)\n\t\t\t}\n\t\t});\n\t}\n\t\n\tfunction updateStudentbtn() {\n\n\t\t$.ajax({\n\t\t\ttype : \"POST\",\n\t\t\turl : \"updateStudent\",\n\t\t\tdata : {\n\t\t\t\tid : $(\"#id\").val(),\n\t\t\t\tname : $(\"#name\").val(),\n\t\t\t\tage : $(\"#age\").val(),\n\t\t\t\tcourse : $(\"#course\").val()\n\t\t\t},\n\t\t\tsuccess : function(result) {\n\t\t\t\tgetAllrecord();\n\n\t\t\t\t$('#saveStudent').show();\n\t\t\t\t$('#updateStudent').hide();\n\t\t\t\t$('#idField').hide();\n\t\t\t\t$('#studentForm')[0].reset()\n\t\t\t},\n\t\t\terror : function(err) {\n\t\t\t\talert(\"error is\" + err)\n\t\t\t}\n\t\t});\n\n\t}\n\n\tfunction deleteStudent(id) {\n\t\t$.ajax({\n\t\t\turl : \"deleteStudent/\" + id,\n\t\t\tsuccess : function(response) {\n\t\t\t\tgetAllrecord();\n\t\t\t},\n\t\t\terror : function(err) {\n\t\t\t\talert(\"error is\" + err)\n\t\t\t}\n\t\t});\n\t}\n\n</script>\n\n</head>\n<body>\n\n\t<div class=\"container mt-3\">\n\t\t<form id=\"studentForm\" name=\"studentform\">\n\t\t\t<div class=\"row\">\n\t\t\t\t<div class=\"col-4\">\n\t\t\t\t\t<h3>Student Form</h3>\n\n\n\t\t\t\t\t<div class=\"row\" id=\"idField\">\n\t\t\t\t\t\t<div class=\"col\">\n\t\t\t\t\t\t\t<div class=\"form-group\">\n\t\t\t\t\t\t\t\t<label for=\"id\">ID</label> <input type=\"text\" readonly=\"readonly\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"id\" name=\"id\">\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t</div>\n\n\n\t\t\t\t\t<div class=\"row\">\n\t\t\t\t\t\t<div class=\"col\">\n\t\t\t\t\t\t\t<div class=\"form-group\">\n\t\t\t\t\t\t\t\t<label for=\"name\">Name</label> <input type=\"text\"\n\t\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"name\" name=\"name\"\n\t\t\t\t\t\t\t\t\tplaceholder=\"Enter Name\">\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t</div>\n\n\t\t\t\t\t<div class=\"row\">\n\t\t\t\t\t\t<div class=\"col\">\n\t\t\t\t\t\t\t<div class=\"form-group\">\n\t\t\t\t\t\t\t\t<label for=\"age\">Age</label> <input type=\"text\"\n\t\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"age\" name=\"age\"\n\t\t\t\t\t\t\t\t\tplaceholder=\"Enter Age\">\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t</div>\n\n\t\t\t\t\t<div class=\"row\">\n\t\t\t\t\t\t<div class=\"col\">\n\t\t\t\t\t\t\t<div class=\"form-group\">\n\t\t\t\t\t\t\t\t<label for=\"name\">Course</label> <input type=\"text\"\n\t\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"course\" name=\"course\"\n\t\t\t\t\t\t\t\t\tplaceholder=\"Enter Course\">\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t</div>\n\t\t\t\t\t<div class=\"row\">\n\t\t\t\t\t\t<div class=\"col\">\n\t\t\t\t\t\t\t<button type=\"button\" id=\"saveStudent\" class=\"btn btn-primary\">Submit</button>\n\t\t\t\t\t\t\t<button type=\"button\" id=\"updateStudent\"\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"updateStudentbtn()\" class=\"btn btn-primary\">Update</button>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t</div>\n\t\t\t\t</div>\n\t\t\t\t<div class=\"col-8\">\n\n\t\t\t\t\t<h3>Student Record</h3>\n\t\t\t\t\t\n\t\t\t\t\t <br>\n\t\t\t\t\t<table class=\"table table-hover\">\n\t\t\t\t\t <caption>Student form</caption>\n\t\t\t\t\t\t<thead>\n\t\t\t\t\t\t\t<tr>\n\t\t\t\t\t\t\t\t<th scope=\"col\">ID</th>\n\t\t\t\t\t\t\t\t<th scope=\"col\">Name</th>\n\t\t\t\t\t\t\t\t<th scope=\"col\">Age</th>\n\t\t\t\t\t\t\t\t<th scope=\"col\">Course</th>\n\t\t\t\t\t\t\t\t<th scope=\"col\">Edit</th>\n\t\t\t\t\t\t\t\t<th scope=\"col\">Delete</th>\n\t\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t</thead>\n\t\t\t\t\t\t<tbody id=\"studentTable\">\n\t\t\t\t\t\t");
      out.write("\n\n\t\t\t\t\t\t</tbody>\n\t\t\t\t\t</table>\n\n\t\t\t\t</div>\n\n\t\t\t</div>\n\t\t</form>\n\t</div>\n\n</body>\n</html>");
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

  private boolean _jspx_meth_s_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_s_005furl_005f0 = new org.springframework.web.servlet.tags.UrlTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_s_005furl_005f0);
    try {
      _jspx_th_s_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005furl_005f0.setParent(null);
      // /WEB-INF/views/./base.jsp(11,1) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005furl_005f0.setVar("url_jqlib");
      // /WEB-INF/views/./base.jsp(11,1) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005furl_005f0.setValue("/resources/js/jquery-3.6.0.min.js");
      int[] _jspx_push_body_count_s_005furl_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
        if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_s_005furl_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_s_005furl_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_s_005furl_005f0.doFinally();
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005furl_005f0, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = new org.apache.taglibs.standard.tag.rt.core.OutTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_c_005fout_005f0);
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /WEB-INF/views/./base.jsp(39,7) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_eval_c_005fout_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_005fout_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_c_005fout_005f0);
        }
        do {
          out.write(" home page");
          int evalDoAfterBody = _jspx_th_c_005fout_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_005fout_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), false);
    }
    return false;
  }
}
