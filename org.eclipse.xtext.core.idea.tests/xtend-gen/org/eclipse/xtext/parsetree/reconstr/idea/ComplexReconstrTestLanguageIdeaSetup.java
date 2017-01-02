package org.eclipse.xtext.parsetree.reconstr.idea;

import com.google.inject.Injector;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.idea.extensions.EcoreGlobalRegistries;
import org.eclipse.xtext.parsetree.reconstr.idea.ComplexReconstrTestLanguageStandaloneSetupIdea;

@SuppressWarnings("all")
public class ComplexReconstrTestLanguageIdeaSetup implements ISetup {
  @Override
  public Injector createInjectorAndDoEMFRegistration() {
    Injector _xblockexpression = null;
    {
      EcoreGlobalRegistries.ensureInitialized();
      _xblockexpression = new ComplexReconstrTestLanguageStandaloneSetupIdea().createInjector();
    }
    return _xblockexpression;
  }
}
