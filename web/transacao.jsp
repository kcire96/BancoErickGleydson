<html lang="pt-br">
    <head>
        <title>Transacao</title>
   
    </head>
    <body>
        <div>Banco</div>
     

<form action="banco" method="post" class="form-horizontal">
<fieldset>


<legend>Informe os dados abaixo</legend>


<div class="form-group">
  <label class="col-md-4 control-label" for="conta">conta</label>  
  <div class="col-md-4">
  <input id="conta" name="conta" type="text" class="form-control input-md" >
    
  </div>
</div>


<div class="form-group">
  <label class="col-md-4 control-label" for="valor">Valor</label>  
  <div class="col-md-4">
  <input id="valor" name="valor" type="text"  class="form-control input-md" >

  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="data">Data</label>  
  <div class="col-md-4">
  <input id="data" name="data" type="text" class="form-control input-md" required="">

  </div>
</div>




<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="cpf">Cpf</label>  
  <div class="col-md-4">
  <input id="cpf" name="cpf" type="text"  class="form-control input-md" required="">
  
  </div>
</div>
<div class="form-group">
  <label class="col-md-4 control-label" for="enviar"></label>
  <div class="col-md-4">
    <button id="enviar" name="enviar" class="btn btn-success">concluir</button>
  </div>
</div>


</fieldset>
</form>

        
        
    </body>
</html>
