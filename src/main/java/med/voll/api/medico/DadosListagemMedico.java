package med.voll.api.medico;



public record DadosListagemMedico(Long id, String nome, String email, String crm) {

    public DadosListagemMedico(Long id, String nome, String email, String crm) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.crm = crm;
    }
}
