package oxxy.kero.roiaculte.team7.domain.use_cases

import kotlinx.coroutines.CoroutineDispatcher
import oxxy.kero.roiaculte.team7.domain.exception.Failure
import oxxy.kero.roiaculte.team7.domain.functional.CouroutineDispatchers
import oxxy.kero.roiaculte.team7.domain.functional.Either
import oxxy.kero.roiaculte.team7.domain.interactors.EitherInteractor
import oxxy.kero.roiaculte.team7.domain.interactors.None
import oxxy.kero.roiaculte.team7.domain.repositories.AuthentificationRepository

class SignInUseCase(private val dispatchers: CouroutineDispatchers,
                    private val authRepository :AuthentificationRepository): EitherInteractor<RegistrationModel, None>{
    override val dispatcher: CoroutineDispatcher
        get() = dispatchers.computaion

    override suspend fun invoke(executeParams: RegistrationModel): Either<Failure, None> {
        return authRepository.registreUser(executeParams)
    }
}
data class RegistrationModel(val mail :String , val pass :String )