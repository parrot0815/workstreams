package de.peter.uebersicht.adapter.in.restservice;

import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.quarkus.security.identity.SecurityIdentity;

@Path("/api/users")
@RequestScoped
public class UsersResource {

	@Inject
	SecurityIdentity securityIdentity;

	@GET
	@Path("/me")
	@RolesAllowed("user")
	public User me() {
		return new User(securityIdentity);
	}

	public static class User {

		private final String userName;

		User(SecurityIdentity securityIdentity) {
			this.userName = securityIdentity.getPrincipal().getName();
		}

		public String getUserName() {
			return userName;
		}
	}
}