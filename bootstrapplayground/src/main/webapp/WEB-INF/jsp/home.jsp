<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<script src="js/jquery-1.11.0.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	
<style>
	.loading{
		background-image:url('images/ajax-loader.gif');
		background-repeat:no-repeat;
		background-position:center;
		background-attachment:fixed;
	}
</style>
</head>
<script type="text/javascript">
	$(function(){
		$('a[data-toggle="tab"]').on('shown.bs.tab', loadTabContent);
	});
	function loadTabContent(){
		 $("body").addClass("loading");
		 $("#myTabContent div.active").load("model", function(){
			 $("body").removeClass("loading");
		 });
	}
</script>
<body>
    <ul class="nav nav-tabs">
      <li class="active"><a href="#tab1" data-toggle="tab">Home</a></li>
      <li><a href="#tab2" data-toggle="tab" >Profile</a></li>
    </ul>
    <div class="tab-content" id="myTabContent">
      <div class="tab-pane fade in active" id="tab1">
      </div>
      <div class="tab-pane fade" id="tab2">
      </div>
    </div>
</body>
</html>
