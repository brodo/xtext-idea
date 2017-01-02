package org.eclipse.xtext.parser.parameters.idea;

import com.google.inject.Injector;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.idea.extensions.EcoreGlobalRegistries;
import org.eclipse.xtext.parser.parameters.idea.ParametersTestLanguageExStandaloneSetupIdea;

@SuppressWarnings("all")
public class ParametersTestLanguageExIdeaSetup implements ISetup {
  @Override
  public Injector createInjectorAndDoEMFRegistration() {
    Injector _xblockexpression = null;
    {
      EcoreGlobalRegistries.ensureInitialized();
      _xblockexpression = new ParametersTestLanguageExStandaloneSetupIdea().createInjector();
    }
    return _xblockexpression;
  }
}
