package org.toasthub.system.general;

import org.toasthub.core.general.model.RestRequest;
import org.toasthub.core.general.model.RestResponse;

public interface SystemSvc {

	public void initMenu(RestRequest request, RestResponse response);
	
}
