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
        <div id="container"></div>

        <div style="display: none;" id="dialog_add_client" title="Mantenimiento Variedad">
            <form action="" class="full validate" name="popup" id="popup">
                <div class="row">           
                    <label for="f2_select2">
                        <strong>Almacen</strong>
                        <small>Denominacion</small>
                    </label>
                    <div>
                        <select name="almacen" id="almacen" class="search" data-placeholder="Seleccione almacen">
                            <c:forEach var="lisAlmacen" items="${listAlmacen}">
                                <option value="<c:out value="${lisAlmacen.almacenid}"></c:out>"><c:out value="${lisAlmacen.denominacionA}"></c:out></option>
                            </c:forEach>
                        </select>
                    </div>
                </div>   
                              
                <div class="row">                    
                    <label for="d2_username">
                        <strong>Denominacion</strong>
                        <small>Variedad</small>
                    </label>
                    <div>
                        <input class="required" type="text" name="txtdenominacion" id="txtdenominacion" />
                    </div>
                </div>   
                <div class="row">                    
                    <label for="d2_username">
                        <strong>Descripcion</strong>
                        <small>Variedad</small>
                    </label>
                    <div>
                        <input class="required" type="text" name="txtdescripcion" id="txtdescripcion" />
                    </div>
                </div>  

            </form>
            <div class="actions">
                <div class="left">
                    <button class="grey cancel">Cancelar</button>
                </div>
                <div class="right">
                    <button class="submit">Guardar</button>
                </div>
            </div>
        </div><!-- End if #dialog_add_client -->

        <div role="main" id="main" class="container_12 clearfix">
            <section id="content" class="container_12 clearfix" data-sort="true">
                <form action="" class="grid_12">
                    <legend>VARIEDAD</legend> 
                    <div class="content">
                        <div class="tabletools">
                            <div class="left">
                                <a class="open-add-client-dialog" href="javascript:void(0);"><i class="icon-plus"></i>Nueva Variedad</a>
                            </div>                         
                        </div>                        
                    </div>     
                    <table id="list"></table> 
                    <div id="page"></div>
                </form>
            </section>
        </div>
        <script>
            $$.ready(function() {
                $('#container').data("registrar", 0);
            });
        </script>
        <script>
            $$.ready(function() {
                $(".open-add-client-dialog").click(function() {
                    $('#container').data("registrar", 1);
                    $("#dialog_add_client").dialog("open");
                    return false;
                });
                $("#dialog_add_client").dialog({
                    autoOpen: false,
                    modal: true,
                    width: 400,
                    open: function() {
                        $(this).parent().css('overflow', 'visible');
                        $$.utils.forms.resize();
                    }
                }).find('button.submit').click(function() {
                    var $el = $(this).parents('.ui-dialog-content');

                    if ($el.validate().form()) {
                        var iOps = $('#container').data('registrar');
                        if (iOps === 1) {
                            registrar();
                            $el.find('form')[0].reset();
                            $el.dialog('close');
                        }
                        if (iOps === 2) {
                            Update();
                            $el.find('form')[0].reset();
                            $el.dialog('close');
                        }

                    }
                }).end().find('button.cancel').click(function() {
                    var $el = $(this).parents('.ui-dialog-content');
                    $el.find('form')[0].reset();
                    $el.dialog('close');

                });

            });
        </script>        
        <script>
            $$.loaded();
        </script>
        <script>
            function getData() {
                $(document).ready(function() {
                    $("#list").jqGrid({
                        url: "recuperarVariedad.htm",
                        datatype: 'json',
                        height: 'auto',
                        width: 'auto',
                        colNames: ['NRO', 'ALMACEN', 'DENOMINACION', 'DESCRIPCION', 'IMAGEN', 'ESTADO', 'EDIT', 'DEL'],
                        colModel: [
                            {name: 'variedadid', index: 'variedadid', width: 50, sortable: false, align: 'left'},
                            {name: 'denominacionA', index: 'denominacionA', width: 150, sortable: false, align: 'left'},
                            {name: 'denominacionV', index: 'denominacionV', width: 150, sortable: false, align: 'left'},
                            {name: 'descripcionV', index: 'descripcionV', width: 250, sortable: false, align: 'left'},
                            {name: 'imagen', index: 'imagen', width: 100, sortable: false, align: 'left'},
                            {name: 'estadovariedad', index: 'estadovariedad', width: 50, sortable: false, align: 'center', formatter: activoFormatter},
                            {name: "edit", index: "edit", width: 40, sortable: false, label: " "},
                            {name: "del", index: "del", width: 40, sortable: false, label: " "}
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
                        caption: "LISTA DE VARIEDADES"
                    }).navGrid('#page', {edit: false, add: false, del: false, search: false});
                });
            }
        </script>
        <script type="text/javascript">
            function  activoFormatter(cellvalue, options, rowObject) {
                var cellValueInt = cellvalue;
                var arr = cellvalue.split(',');
                if (cellValueInt === '1')
                    return "<img src='img/elements/forms/icon-success.png' alt='" + cellvalue + "'title='" + cellvalue + "' />";
                else if (cellValueInt === '2')
                    return "<img src='img/elements/alert-boxes/success.png' alt='" + cellvalue + "'title='" + cellvalue + "' />";
                else
                    return "<img src='img/elements/alert-boxes/error.png' alt='" + cellvalue + "'title='" + cellvalue + "' />";
            }

            function Editar(id) {
                var data = jQuery('#list').jqGrid('getRowData', id);
                $('#container').data("registrar", 2);
                $('#container').data("variedadid", data.variedadid);
                $('#txtdenominacion').val(data.denominacion);
                $('#txtdescripcion').val('');
                $('#almacen option[value="' + data.almacenid + '"]').attr('selected', 'selected');
                $('#unidMedida option[value="' + data.unidadmedidaid + '"]').attr('selected', 'selected');
                $("#dialog_add_client").dialog("open");
                return false;

            }
            function Eliminar(id) {
                var object = {variedadid: id};
                $.ajax({
                    type: "get",
                    url: "deleteVariedad.htm",
                    data: object,
                    dataType: "json",
                    success: function(response) {
                        var mensaje = response;
                        $("#list").trigger("reloadGrid");
                    },
                    error: function(e) {
                        alert('Error General .......: ' + e.toString());
                    }
                });
            }

            function registrar() {
                var object = {
                    almacenid: $('#almacen').val(),
                    unidadmedidaid: $('#unidMedida').val(),
                    denominacion: $('#txtdenominacion').val(),
                    descripcion: $('#txtdescripcion').val()
                };
                $.ajax({
                    type: "get",
                    url: "insertVariedad.htm",
                    data: object,
                    dataType: "json",
                    success: function(response) {
                        $("#list").setGridParam({datatype: 'json', page: 1}).trigger('reloadGrid');
                    },
                    error: function(e) {
                        alert('Error General .......: ' + e.toString());
                    }
                });
            }
            function Update() {
                var object = {
                    variedadid: $('#container').data("variedadid"),
                    almacenid: $('#almacen').val(),
                    unidadmedidaid: $('#unidMedida').val(),
                    denominacion: $('#txtdenominacion').val(),
                    descripcion: $('#txtdescripcion').val()
                };
                $.ajax({
                    type: "get",
                    url: "updateVariedad.htm",
                    data: object,
                    dataType: "json",
                    success: function(response) {
                        $("#list").trigger("reloadGrid");
                    },
                    error: function(e) {
                        alert('Error General .......: ' + e.toString());
                    }
                });
            }
        </script>
    </body>
</html>
