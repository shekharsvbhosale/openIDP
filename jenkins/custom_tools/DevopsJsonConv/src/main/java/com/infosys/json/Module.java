/***********************************************************************************************
*
* Copyright 2018 Infosys Ltd.
* Use of this source code is governed by MIT license that can be found in the LICENSE file or at
* https://opensource.org/licenses/MIT.
*
***********************************************************************************************/
package com.infosys.json;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Module {
	@SerializedName("moduleName")
	@Expose
	private List<String> moduleName;

	public List<String> getModuleName() {
		return moduleName;
	}

	public void setModuleName(List<String> moduleName) {
		this.moduleName = moduleName;
	}
}
