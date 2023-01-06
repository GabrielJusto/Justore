package br.com.bonatto.Justore.validacao;

import br.com.bonatto.Justore.dro.usuario.RequisicaoCadastroUsuario;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;



public class CadastroUsuarioValidacao implements ConstraintValidator<CadastroUsuarioValido, RequisicaoCadastroUsuario> {

	@Override
	public boolean isValid(RequisicaoCadastroUsuario value, ConstraintValidatorContext context) {

        
		boolean valid = value.getSenha().equals(value.getSenhaConfirmacao());
		
		if(!valid)
		{
			context.disableDefaultConstraintViolation();
	        context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
	                .addPropertyNode( "senhaConfirmacao" ).addConstraintViolation();
		}
		return valid;
			
	}

}
