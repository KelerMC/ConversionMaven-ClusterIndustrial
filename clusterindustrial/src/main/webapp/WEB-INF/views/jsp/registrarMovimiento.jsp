<%-- 
    Document   : registrarCluster
    Created on : 29-sep-2013, 8:21:58
    Author     : ARANGO
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />

        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

        <title>UNIVERSIDAD NACIONAL DE SAN CRISTÓBAL DE HUAMANGA</title>
        <meta name="description" content="Mango is a slick and responsive Admin Template build with modern techniques like HTML5 and CSS3 to be used for backend solutions of any size." />
        <meta name="author" content="Simon Stamm & Markus Siemens" />

        <!-- Mobile viewport optimized: h5bp.com/viewport -->
        <meta name="viewport" content="width=device-width,initial-scale=1" />
        <!-- iPhone: Don't render numbers as call links -->
        <meta name="format-detection" content="telephone=no" />

        <link rel="shortcut icon" href="favicon.ico" />
        <!-- Place favicon.ico and apple-touch-icon.png in the root directory: mathiasbynens.be/notes/touch-icons -->
        <!-- Icon Styles -->
        <link rel="stylesheet" href="css/icons.css" />
        <link rel="stylesheet" href="css/fonts/font-awesome.css" />
        <!--[if IE 8]><link rel="stylesheet" href="css/fonts/font-awesome-ie7.css"><![endif]-->

        <!-- External Styles -->
        <link rel="stylesheet" href="css/external/jquery-ui-1.8.21.custom.css" />
        <link rel="stylesheet" href="css/external/jquery.chosen.css" />
        <link rel="stylesheet" href="css/external/jquery.cleditor.css" />
        <link rel="stylesheet" href="css/external/jquery.colorpicker.css" />
        <link rel="stylesheet" href="css/external/jquery.elfinder.css" />
        <link rel="stylesheet" href="css/external/jquery.fancybox.css" />
        <link rel="stylesheet" href="css/external/jquery.jgrowl.css" />
        <link rel="stylesheet" href="css/external/jquery.plupload.queue.css" />
        <link rel="stylesheet" href="css/external/syntaxhighlighter/shCore.css" />
        <link rel="stylesheet" href="css/external/syntaxhighlighter/shThemeDefault.css" />

        <!-- Elements -->
        <link rel="stylesheet" href="css/elements.css" />
        <link rel="stylesheet" href="css/forms.css" />

        <!-- OPTIONAL: Print Stylesheet for Invoice -->
        <link rel="stylesheet" href="css/print-invoice.css" />

        <!-- Typographics -->
        <link rel="stylesheet" href="css/typographics.css" />

        <!-- Responsive Design -->
        <link rel="stylesheet" href="css/media-queries.css" />

        <!-- Bad IE Styles -->
        <link rel="stylesheet" href="css/ie-fixes.css" />


        <!-- Load Webfont loader -->
        <script type="text/javascript">
            window.WebFontConfig = {
                google: {families: ['PT Sans:400,700']},
                active: function() {
                    $(window).trigger('fontsloaded');
                }
            };
        </script>


        <!-- Essential polyfills -->
        <script src="js/mylibs/polyfills/modernizr-2.6.1.min.js"></script>
        <script src="js/mylibs/polyfills/respond.js"></script>
        <script src="js/mylibs/polyfills/matchmedia.js"></script>
        <!--[if lt IE 9]><script src="js/mylibs/polyfills/selectivizr-min.js"></script><![endif]-->

        <script src="js/libs/jquery-1.7.2.min.js"></script>
        <script src="js/libs/jquery-ui-1.8.21.min.js"></script>
        <script src="js/libs/lodash.min.js"></script>

        <!-- General Scripts -->
        <script src="js/mylibs/jquery.hashchange.js"></script>
        <script src="js/mylibs/jquery.idle-timer.js"></script>
        <script src="js/mylibs/jquery.plusplus.js"></script>
        <script src="js/mylibs/jquery.jgrowl.js"></script>
        <script src="js/mylibs/jquery.scrollTo.js"></script>
        <script src="js/mylibs/jquery.ui.touch-punch.js"></script>
        <script src="js/mylibs/jquery.ui.multiaccordion.js"></script>
        <script src="js/mylibs/number-functions.js"></script>

        <!-- Forms -->
        <script src="js/mylibs/forms/jquery.autosize.js"></script>
        <script src="js/mylibs/forms/jquery.checkbox.js"></script>
        <script src="js/mylibs/forms/jquery.chosen.js"></script>
        <script src="js/mylibs/forms/jquery.cleditor.js"></script>
        <script src="js/mylibs/forms/jquery.colorpicker.js"></script>
        <script src="js/mylibs/forms/jquery.ellipsis.js"></script>
        <script src="js/mylibs/forms/jquery.fileinput.js"></script>
        <script src="js/mylibs/forms/jquery.fullcalendar.js"></script>
        <script src="js/mylibs/forms/jquery.maskedinput.js"></script>
        <script src="js/mylibs/forms/jquery.mousewheel.js"></script>
        <script src="js/mylibs/forms/jquery.placeholder.js"></script>
        <script src="js/mylibs/forms/jquery.pwdmeter.js"></script>
        <script src="js/mylibs/forms/jquery.ui.datetimepicker.js"></script>
        <script src="js/mylibs/forms/jquery.ui.spinner.js"></script>
        <script src="js/mylibs/forms/jquery.validate.js"></script>
        <script src="js/mylibs/forms/jquery.ui.datepicker-es.js"></script>
        <script src="js/mylibs/forms/uploader/plupload.js"></script>
        <script src="js/mylibs/forms/uploader/plupload.html5.js"></script>
        <script src="js/mylibs/forms/uploader/plupload.html4.js"></script>
        <script src="js/mylibs/forms/uploader/plupload.flash.js"></script>
        <script src="js/mylibs/forms/uploader/jquery.plupload.queue/jquery.plupload.queue.js"></script>


        <!-- Explorer -->
        <script src="js/mylibs/explorer/jquery.elfinder.js"></script>

        <!-- Fullstats -->
        <script src="js/mylibs/fullstats/jquery.css-transform.js"></script>
        <script src="js/mylibs/fullstats/jquery.animate-css-rotate-scale.js"></script>
        <script src="js/mylibs/fullstats/jquery.sparkline.js"></script>

        <!-- Syntax Highlighter -->
        <script src="js/mylibs/syntaxhighlighter/shCore.js"></script>
        <script src="js/mylibs/syntaxhighlighter/shAutoloader.js"></script>

        <!-- Tooltips -->
        <script src="js/mylibs/tooltips/jquery.tipsy.js"></script>

        <!-- Do not touch! -->
        <script src="js/mango.js"></script>
        <script src="js/plugins.js"></script>
        <script src="js/script.js"></script>

        <!-- Your custom JS goes here -->
        <script src="js/app.js"></script>

        <!-- end scripts -->

        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

        <!-- jqgrid -->
        <link rel="stylesheet" href="jqgrid/jqgrid/ui.jqgrid.css"/>     
        <script src="jqgrid/script/grid.locale-es.js" type="text/javascript"></script>
        <script src="jqgrid/script/jquery.jqGrid.min.js" type="text/javascript"></script>

    </head>
    <body onload="getData();">

        <div role="main" id="main" class="container_12 clearfix">
            <section id="content" class="container_12 clearfix" data-sort="true">
                <form action="" class="grid_12">

                    <legend>LISTA CERTIFICADO APROBADO PENDIENTE DE PAGO</legend>   
                    <div class="content">

                        <table id="list"></table> 
                        <div id="page"></div>
                    </div>

                </form>
                <form action=""  class="grid_12" id="signupform" name="signupform">

                    <legend>REGISTRO DE PAGO CERTIFICADO</legend>
                    <div class="row">
                        <label for="v1_normal_input">
                            <strong>NRO CERTIFICADO</strong>
                        </label>
                        <div>
                            <input class="required" type="text" disabled="" name="txtcertificadoid" id="txtcertificadoid" />
                        </div>
                    </div>

                    <div class="row">
                        <label for="v1_normal_input">
                            <strong>SUB TOTAL</strong>
                        </label>
                        <div>
                            <input class="required" type="text" disabled=""id="txtsubtotal" name="txtsubtotal" value="" />  
                        </div>
                    </div>            


                    <div class="row">
                        <label for="v1_normal_input">
                            <strong>GLOSA</strong>
                        </label>
                        <div>
                            <input class="required" type="text" id="txtglosa" name="txtglosa" value="" />  
                        </div>
                    </div>            

                    <div class="row">
                        <label for="v1_normal_input">
                            <strong>BOUCHER</strong>
                        </label>
                        <div>
                            <input class="required" type="file" id="txtboucher" name="txtboucher" value="" />  
                        </div>
                    </div>    

                    <div class="row">
                        <label for="v1_normal_input">
                            <strong>CCI</strong>
                        </label>
                        <div>
                            <input class="required" type="text" disabled="" id="txtcci" name="txtcci" value="" />  
                        </div>
                    </div> 

                    <div class="row">
                        <label for="v1_normal_input">
                            <strong>NRO TRANSACCION</strong>
                        </label>
                        <div>
                            <input class="required" type="text" id="txtnumerotransaccion" name="txtnumerotransaccion" value="" />  
                        </div>
                    </div>    
                    <div class="row">
                        <label for="v1_normal_input">
                            <strong>FECHA TRANSACCION</strong>
                        </label>
                        <div>
                            <input class="required" type="date" id="txtfechatransaccion" name="txtfechatransaccion" value="" />  
                        </div>
                    </div>                   


                    <div class="actions">
                        <div class="left">
                            <input type="reset" value="Nuevo" />
                        </div>
                        <div class="right">
                            <input type="button" id="btnGuardar" name="btnGuardar" value="Guardar"/>                           
                        </div>                   
                    </div>
                </form>
            </section>
        </div>

        <script>
            $$.loaded();
        </script>

        <script type="text/javascript">
            function getData() {
                $(document).ready(function() {

                    $("#list").jqGrid({
                        url: "recuperarCertificadoPago.htm",
                        datatype: 'json',
                        mtype: 'GET',
                        height: 'auto',
                        width: 'auto',
                        colNames: ['NRO', 'COD. CERTIFICADO.', 'ENT. GARANTE', 'RESPONSABLE', 'NRO. ORDEN', 'FEC. CERTIFICACION', 'CANT.', 'PRECIO UNIT.', 'NETO', 'IGV', 'TRANSPORTE', 'TOTAL', 'APROBADO', 'PAGO'],
                        colModel: [
                            {name: 'certificadoid', index: 'certificadoid', width: 50, sortable: false, align: 'center'},
                            {name: 'codigocertificado', index: 'codigocertificado', width: 100, sortable: false, align: 'center'},
                            {name: 'nombreentidad', index: 'nombreentidad', width: 140, sortable: false, align: 'left'},
                            {name: 'nombrecompleto', index: 'nombrecompleto', width: 140, sortable: false, align: 'left'},
                            {name: 'ordencompraid', index: 'ordencompraid', width: 50, sortable: false, align: 'center'},
                            {name: 'fechacertificacion', index: 'fechacertificacion', width: 80, sortable: false, align: 'center'},
                            {name: 'cantidad', index: 'cantidad', width: 40, sortable: false, align: 'right'},
                            {name: 'preciounitario', index: 'preciounitario', width: 50, sortable: false, align: 'right'},
                            {name: 'costototal', index: 'costototal', width: 50, sortable: false, align: 'right'},
                            {name: 'igv', index: 'igv', width: 30, sortable: false, align: 'right'},
                            {name: 'costotrasnporte', index: 'costotrasnporte', width: 70, sortable: false, align: 'right'},
                            {name: 'precioventa', index: 'precioventa', width: 50, sortable: false, align: 'right'},
                            {name: 'estadoresponsable', index: 'estadoresponsable', width: 50, sortable: false, align: 'center'},
                            {name: 'estadopagoC', index: 'estadopagoC', width: 50, sortable: false, align: 'right'}
                        ],
                        multiselect: false,
                        paging: true,
                        rowNum: 10,
                        rowList: [10, 20, 30],
                        pager: $("#page"),
                        loadonce: true,
                        sortorder: "desc",
                        viewrecords: true,
                        gridComplete: function() {
                            var ids = $("#list").jqGrid('getDataIDs');
                            var i;
                            for (i = 0; i < ids.length; i++) {
                                var cl = ids[i];
                                be = "<img style='cursor:pointer;' src='img/icons/packs/fugue/24x24/pencil.png' alt='Editar' title='Editar' onclick=\"Editar('" + cl + "');\" />";
                                ce = "<img style='cursor:pointer;' src='img/icons/packs/fugue/24x24/cross.png' alt='Eliminar' title='Eliminar'onclick=\"Eliminar('" + cl + "');\" />";
                                $("#list").jqGrid('setRowData', ids[i], {
                                    edit: be
                                });
                                $("#list").jqGrid('setRowData', ids[i], {
                                    del: ce
                                });
                            }
                        },
                        onSelectRow: function(id) {
                            var userCode = $("#list").jqGrid('getGridParam', 'selrow');

                            if (userCode) {
                                var ret = $("#list").jqGrid('getRowData', userCode);

                                $('#txtsubtotal').val(ret.precioventa);
                                $('#txtcertificadoid').val(ret.certificadoid);
                                $('#txtcci').val(113265987412366598);

                            }
                        },
                        caption: "LISTA CERTIFICADO APROBADO PENDIENTE DE PAGO"
                    }).navGrid('#page', {edit: false, add: false, del: false, search: false});


                });
            }
        </script>

        <script type="text/javascript">
            function  activoFormatter(cellvalue, options, rowObject) {
                var cellValueInt = cellvalue;
                var arr = cellvalue.split(',');
                if (cellValueInt == 'ACT')
                    return "<img src='img/elements/forms/icon-success.png' alt='" + cellvalue + "'title='" + cellvalue + "' />";
                else if (cellValueInt == 'INAC')
                    return "<img src='img/elements/alert-boxes/success.png' alt='" + cellvalue + "'title='" + cellvalue + "' />";
                else
                    return "<img src='img/elements/alert-boxes/error.png' alt='" + cellvalue + "'title='" + cellvalue + "' />";
            }

            function Activar(id) {
                $.ajax({
                    url: "activarPregunta.htm",
                    type: 'get',
                    data: "id=" + id,
                    dataType: "json",
                    success: function(rpt) {
                        $("#list").trigger("reloadGrid");
                    }
                });
            }
        </script>

        <script type="text/javascript">
            $$.ready(function() {
                $("#btnGuardar").click(function() {

                    var txtfechatransaccion = $("#txtfechatransaccion").val();
                    var txtsubtotal = $("#txtsubtotal").val();
                    var txtglosa = $("#txtglosa").val();
                    var txtboucher = $("#txtboucher").val();
                    var txtcertificadoid = $("#txtcertificadoid").val();
                    var txtcci = $("#txtcci").val();
                    var txtnumerotransaccion = $("#txtnumerotransaccion").val();

                    var object = {
                        txtfechatransaccion: txtfechatransaccion, txtsubtotal: txtsubtotal,
                        txtglosa: txtglosa, txtboucher: txtboucher,
                        txtcertificadoid: txtcertificadoid, txtcci: txtcci, txtnumerotransaccion: txtnumerotransaccion
                    };

                    $.ajax({
                        type: "get",
                        url: "registrarMovimientoPago.htm",
                        data: object,
                        dataType: "json",
                        success: function(response) {
                            var i;
                            for (i = 0; i < response.length; i++) {
                                alert(response[i].rta + response[i].det_rta);
                            }
                            window.close();
                            $("#signupform")[0].reset();
                            $("#list").setGridParam({datatype: 'json', page: 1}).trigger('reloadGrid');
                        },
                        error: function(e) {
                            alert('Error General .......: ' + e.toString());
                        }
                    });
                });
            });
        </script>
    </body>
</html>
