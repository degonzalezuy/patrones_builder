package builder;


//La interface IBuilder la utilizaremos pare tener un interface en común entre todos
//los Builder que creemos en la aplicación.
//Esta interface es opcional, pero se crea para casos en los cuales pueden haber más clases Builder
public interface IBuilder <T>{
    public T build();
}
