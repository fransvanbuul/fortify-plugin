package com.fortify.plugin.jenkins.steps.remote;

import hudson.Extension;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

public class PhpProjectType extends RemoteAnalysisProjectType {
    private String phpVersion;

    @DataBoundConstructor
    public PhpProjectType() {}

    public String getPhpVersion() { return phpVersion; }

    @DataBoundSetter
    public void setPhpVersion(String phpVersion) { this.phpVersion = phpVersion; }

    @Extension @Symbol("fortifyPHP")
    public static final class DescriptorImpl extends RemoteAnalysisProjectTypeDescriptor {
        public DescriptorImpl() {
            super(PhpProjectType.class);
        }

        @Override
        public String getDisplayName() {
            return "PHP";
        }

    }
}
