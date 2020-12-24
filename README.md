
### jcuda-javacpp-example

An example project showing how to use the infrastructure that is provided
by https://github.com/bytedeco/javacpp to preload native CUDA libraries 
for JCuda.

The POM contains the dependency to JCuda, with a certain version.
For example, version **10.1.0**, which corresponds to CUDA **10.1**:

    <dependency>
        <groupId>org.jcuda</groupId>
        <artifactId>jcuda</artifactId>
        <version>10.1.0</version>
    </dependency>
    
Additionally, the POM contains dependencies to the `cuda-platform` and
`cuda-platform-redist` artifacts of JavaCPP, with a matching version
number - for example, **10.1**-7.6-1.5.2. The `cuda-platform-redist` 
artifacts contain the actual CUDA libraries. The `cuda-platform` artifacts 
contain the "presets" classes that offer the infrastructure for loading the 
required CUDA libraries:
    
    <dependency>
        <groupId>org.bytedeco</groupId>
        <artifactId>cuda-platform</artifactId>
        <version>10.1-7.6-1.5.2</version>
    </dependency>
    <dependency>
        <groupId>org.bytedeco</groupId>
        <artifactId>cuda-platform-redist</artifactId>
        <version>10.1-7.6-1.5.2</version>
    </dependency>

In this example, the functionality for preloading the CUDA libraries is 
summarized in a utility class, `JCudaJavaCppPreloads`, that offers
methods for preloading the CUDA libraries for the individual JCuda 
libraries.
