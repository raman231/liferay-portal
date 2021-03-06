/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.security.sso.token.constants;

/**
 * @author Brian Greenwald
 */
public class LegacyTokenPropsKeys {

	public static final String SHIBBOLETH_AUTH_ENABLED =
		"shibboleth.auth.enabled";

	public static final String SHIBBOLETH_IMPORT_FROM_LDAP =
		"shibboleth.import.from.ldap";

	public static final String[] SHIBBOLETH_KEYS = {
		SHIBBOLETH_AUTH_ENABLED, SHIBBOLETH_IMPORT_FROM_LDAP,
		LegacyTokenPropsKeys.SHIBBOLETH_LOGOUT_URL,
		LegacyTokenPropsKeys.SHIBBOLETH_USER_HEADER
	};

	public static final String SHIBBOLETH_LOGOUT_URL = "shibboleth.logout.url";

	public static final String SHIBBOLETH_USER_HEADER =
		"shibboleth.user.header";

	public static final String SITEMINDER_AUTH_ENABLED =
		"siteminder.auth.enabled";

	public static final String SITEMINDER_IMPORT_FROM_LDAP =
		"siteminder.import.from.ldap";

	public static final String[] SITEMINDER_KEYS = {
		SITEMINDER_AUTH_ENABLED, SITEMINDER_IMPORT_FROM_LDAP,
		LegacyTokenPropsKeys.SITEMINDER_USER_HEADER
	};

	public static final String SITEMINDER_USER_HEADER =
		"siteminder.user.header";

}