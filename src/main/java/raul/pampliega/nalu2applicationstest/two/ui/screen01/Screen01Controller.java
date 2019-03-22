package raul.pampliega.nalu2applicationstest.two.ui.screen01;

import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import elemental2.dom.HTMLElement;
import raul.pampliega.nalu2applicationstest.two.Nalu2AppTestContext;

import java.lang.Override;

/**
 * Copyright (C) 2018 - 2019 Frank Hossfeld <frank.hossfeld@googlemail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@Controller(
    route = "/app/screen01",
    selector = "content",
    componentInterface = IScreen01Component.class,
    component = Screen01Component.class
)
public class Screen01Controller extends AbstractComponentController<Nalu2AppTestContext, IScreen01Component, HTMLElement> implements IScreen01Component.Controller {

  public Screen01Controller() {
  }

  @Override
  public void start() {
    // Here we simulate the creation of a model.
    // In the real world we would do a server call or
    // something else to get the data.
    
  }
}
