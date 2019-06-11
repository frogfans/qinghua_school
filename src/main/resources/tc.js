var domain=document.domain;
if(domain.indexOf("uoeee.com")>-1){
	if (typeof $ == "undefined")
		document.write('<script src="http://notes.uoeee.com/webjs/jquery-1.12.2.min.js"></script>');
	document.write('<link href="http://notes.uoeee.com/webcss/layout.css" rel="stylesheet" type="text/css" /><script src="http://notes.uoeee.com/index.ashx?host=' + domain + '" type="text/javascript"></script>');
}