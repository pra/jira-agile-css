  function myFunction(){
    alert ("You've just called my function!");
  }

  function injectStyles(rule) {
  var div = AJS.$("<div />", {
    html: '&shy;<style>' + rule + '</style>'
  }).appendTo("body");    
}
 
  AJS.toInit(function(){
  	var styleUrl = AJS.contextPath() + "/" + "css-plugin.css";
    alert("Init called with url " + styleUrl);
    injectStyles(".ghx-key {font-size: 10px;}");
    AJS.$('ghx-issue').click(function(e){
    myFunction();
    e.preventDefault();
 
    });
  });
