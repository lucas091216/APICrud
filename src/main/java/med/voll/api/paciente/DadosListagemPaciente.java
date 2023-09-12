package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;

public record DadosListagemPaciente(@NotNull Long id, String nome, String telefone, String email) {
}
