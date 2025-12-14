package edu.itvo.persistenciadatos.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Ledu/itvo/persistenciadatos/domain/usecase/GetUserUseCase;", "", "userRepository", "Ledu/itvo/persistenciadatos/domain/repository/UserRepository;", "(Ledu/itvo/persistenciadatos/domain/repository/UserRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Ledu/itvo/persistenciadatos/domain/model/User;", "app_debug"})
public final class GetUserUseCase {
    @org.jetbrains.annotations.NotNull()
    private final edu.itvo.persistenciadatos.domain.repository.UserRepository userRepository = null;
    
    @javax.inject.Inject()
    public GetUserUseCase(@org.jetbrains.annotations.NotNull()
    edu.itvo.persistenciadatos.domain.repository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<edu.itvo.persistenciadatos.domain.model.User> invoke() {
        return null;
    }
}