package co.com.sofka.empleado.repositorios;

import co.com.sofka.empleado.collections.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioEmpleado extends MongoRepository<Empleado, String> {
}