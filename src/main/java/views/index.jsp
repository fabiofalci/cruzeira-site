<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Cruzeira</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-combined.min.css" rel="stylesheet" media="screen">

	<style type="text/css">
      body {
        padding-top: 40px;
        padding-bottom: 40px;
        background-color: #f5f5f5;
      }

      /* Custom container */
      .container-narrow {
        margin: 0 auto;
        max-width: 700px;
      }
      .container-narrow > hr {
        margin: 30px 0;
      }
    </style>
</head>
<body>

<a href="https://github.com/fabiofalci/cruzeira"><img style="position: absolute; top: 0; right: 0; border: 0;" src="https://s3.amazonaws.com/github/ribbons/forkme_right_green_007200.png" alt="Fork me on GitHub"></a>
<div class="container-narrow">
     <div class="masthead">
        <h3 class="muted">Cruzeira</h3>
    </div>

     <div class="row-fluid marketing">
     	<h4>About</h4>
     	<p>
     		Cruzeira project is an attempt to enable Spring web application to run on Netty.io implementing a subset of the Servlet API.
     	</p>
     </div>
     <div class="row-fluid marketing">
     	<h4>Status</h4>
     	<p>
     		It's on a very early stage without any release yet. It's pretty much an experimental work in progress.
     	</p>
     </div>
     <div class="row-fluid marketing">
     	<h4>Code</h4>
     	<p>
     		It's a regular web project without a web.xml.
     		It configures Spring programmatically using app-context.xml from resources directory. Creating a project
     		using cruzeira archetype will give you this structure:
     	</p>
     	<p class="text-center">
     		<img alt="project" src="<c:url value="/resources/base-project.png" />">
     	</p>
     	<p>
     		To start the application execute: 
     	</p>
     	<p>
     		<code>mvn compile exec:exec:</code> 
     	</p>
     	<p>
     		When the following message appears then the application is up:
     	</p>
     	<p>
     		<code>23:22:58 [main] INFO  Bootstrap - Running cruzeira 8080...</code> 
     	</p>
     </div>
     <div class="row-fluid marketing">
     	<h4>Spring</h4>
     	<p>
     		It's a regular Spring web application with beans, xmls, aop, database access, etc. Therefore you
     		can use any Spring feature normally, in the Spring way, except the web views. To make things simple the
     		JSP files are in 'src/main/java/views'. 
     	</p>
     	<p class="text-center">
     		<img alt="project" src="<c:url value="/resources/views-jsp.png" />">
     	</p>
     	<p>
     		Then the jsp file will be compiled to a Java class in the first execution and Maven will compile this
     		generated Java class. At the end, you will have this:
     	</p>
     	<p class="text-center">
     		<img alt="project" src="<c:url value="/resources/views-jsp-compiled.png" />">
     	</p>
     	<p>
     		If you are curious you can open this Java class and see the result of a JSP file, what is really executed.
     	</p>
     </div>
	 <div class="row-fluid marketing">
     	<h4>Reload</h4>
     	<p>
     		As a big fan of Play! Framework one of the first implemented feature was the automatic reload. Instead
     		of stop and start manually every time, Cruzeira watches for changes in the file system and 
     		then restart the Spring application automatically. It'll not restart the Netty server but only the 
     		application.
     	</p>
     </div>
     <div class="row-fluid marketing">
     	<h4>Github</h4>
     	<p>
     		Github project: <a href="https://github.com/fabiofalci/cruzeira">Cruzeira</a>
     	</p>
     	<p>Stay tuned for news!</p>
     </div>
     <hr>

     <div class="footer">
     	This site is a Spring web application running on top of Netty on Heroku.
     </div>
</div>

</body>
</html>