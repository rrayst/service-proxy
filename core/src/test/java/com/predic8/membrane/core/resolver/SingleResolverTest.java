/* Copyright 2013 predic8 GmbH, www.predic8.com

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License. */
package com.predic8.membrane.core.resolver;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleResolverTest {

	@Test
	public void combineWithWindowsAbsolute() {
		String parent = "C:/git/membrane/service-proxy/distribution/conf/proxies.xml";
		String absChild = "C:\\Desktop\\predic8.keystore";
		assertEquals(absChild, ResolverMap.combine(parent, absChild).replaceAll("/", "\\\\"));
	}

}
