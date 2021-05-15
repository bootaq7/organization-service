package sc.demo.services.organization.repository;

import org.springframework.data.repository.CrudRepository;

import sc.demo.services.organization.model.Organization;

public interface OrganizationRepository extends CrudRepository<Organization, String> {
	
}
