# Resoluções 

3) Explique, com suas palavras, por que construtores de superclasses não
são herdados por subclasses.

    R: Os construtores não são herdados nas subclasses, pois eles são métodos especiais para a construção do objeto que será instaciado pela classe, ou seja, cada classe possui seu construtor exclusivo. Contudo, é possível que uma subclasse adquira os mesmos parâmetros que a classe mãe a partir do método super();

    