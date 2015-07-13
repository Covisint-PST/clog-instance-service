/* Copyright (C) 2014 Covisint. All Rights Reserved. */
package com.covisint.platform.clog.server.cloginstance.impl;

import com.covisint.core.http.service.server.service.BaseResourceService;
import com.covisint.core.support.constraint.Nonnull;
import com.covisint.platform.clog.core.cloginstance.ClogInstance;
import com.covisint.platform.clog.server.cloginstance.ClogInstanceDAO;
import com.covisint.platform.clog.server.cloginstance.ClogInstanceService;

/**
 * @since Jul 13, 2015
 *
 */
public final class ClogInstanceServiceImpl extends BaseResourceService<ClogInstance, ClogInstanceDAO> implements ClogInstanceService {

	/**
	 * Constructs the Service Impl using the passed in  {@link ClogInstanceDAO}
	 * @param dao - Data Access Object for the {@link ClogInstance}
	 */
	public ClogInstanceServiceImpl(@Nonnull final ClogInstanceDAO dao) {
		super(dao);
	}
	
	/** {@inheritDoc} */
	@Override
	public ClogInstance delete(@Nonnull final ClogInstance resource) {
		throw unsupportedDeleteException();
	}
	
	/** {@inheritDoc} */
	@Override
	public ClogInstance delete(String id) {
		throw unsupportedDeleteException();
	}
	
	/**
	 * Creates an unsupported Delete exception for delete methods.
	 */
	private UnsupportedOperationException unsupportedDeleteException() {
		return new UnsupportedOperationException("Only Soft deletes Allowed. Use Update to change the status flag to deleted.");
	}

}
