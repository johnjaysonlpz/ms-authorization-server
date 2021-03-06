package com.project.authorization.security;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

import com.project.base.common.resources.client.ClientRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomClientDetailsService implements ClientDetailsService {

	private ClientRepository clientRepository;


	@Override
	public ClientDetails loadClientByClientId(final String clientId) throws ClientRegistrationException {
		return this.clientRepository.findByClientId(clientId);
	}

}
