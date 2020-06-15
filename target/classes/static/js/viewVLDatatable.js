$(document).ready( function () {
	var queryString = window.location.search;
	var urlParams = new URLSearchParams(queryString);
	var vendorId = urlParams.get('vendorId');
	var table = $('#viewVLTable').DataTable({
			"sAjaxSource": "/showItems/"+vendorId,
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			      { "mData": "batteryId"},
		          { "mData": "vendorId"},
			      { "mData": null,
		        	"sClass": "blue",  
			    	"mRender": function (data, type, row, meta) {
			    	        return '<a href="/battery/' + row['batteryId'] + '?vendorId='+ row['vendorId'] +'">Click here to view battery specs</a>';
			    	    }
			      }
			]
	 })
});