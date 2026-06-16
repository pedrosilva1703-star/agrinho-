function verificarResposta(alternativa) {
    const resultadoDiv = document.getElementById("resultado");
    
    // Remove classes anteriores se houver
    resultadoDiv.className = "";

    if (alternativa === 'B') {
        resultadoDiv.classList.add("correto");
        resultadoDiv.innerHTML = "🎉 PARABÉNS! Resposta Correta.<br>Levar os aparelhos a pontos de coleta específicos alimenta a economia circular, reduz a extração de novos recursos e evita que metais tóxicos contaminem a nossa natureza.";
    } else {
        resultadoDiv.classList.add("errado");
        resultadoDiv.innerHTML = "❌ Ops, resposta incorreta!<br>O descarte irregular causa graves danos à saúde do planeta. A alternativa certa é a <strong>B</strong>. Pontos de e-lixo realizam a logística reversa com segurança.";
    }
}
