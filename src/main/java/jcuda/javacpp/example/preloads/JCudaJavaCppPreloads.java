/*
 * JCuda - Java bindings for NVIDIA CUDA driver and runtime API
 * http://www.jcuda.org
 *
 * Copyright 2020 Marco Hutter - http://www.jcuda.org
 */
package jcuda.javacpp.example.preloads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Utility methods for preloading CUDA libraries.
 */
public class JCudaJavaCppPreloads
{
    /**
     * The logger used in this class
     */
    private static final Logger logger =
        Logger.getLogger(JCudaJavaCppPreloads.class.getName());
    
    /**
     * The log level
     */
    private static final Level level = Level.FINE;
    
    /**
     * Preload the native libraries for JCuda
     */
    public static void preloadCuda()
    {
        logger.log(level, "Preloading Cuda...");
        Cudart.preload();
        Nvrtc.preload();
        logger.log(level, "Preloading Cuda DONE");
    }
    
    /**
     * Preload the native libraries for JCublas
     */
    public static void preloadCublas()
    {
        logger.log(level, "Preloading Cublas...");
        Cublas.preload();
        logger.log(level, "Preloading Cublas DONE");
    }
    
    /**
     * Preload the native libraries for JCufft
     */
    public static void preloadCufft()
    {
        logger.log(level, "Preloading Cufft...");
        Cufft.preload();
        logger.log(level, "Preloading Cufft DONE");
    }
    
    /**
     * Preload the native libraries for JCusparse
     */
    public static void preloadCusparse()
    {
        logger.log(level, "Preloading Cusparse...");
        Cusparse.preload();
        logger.log(level, "Preloading Cusparse DONE");
    }
    
    /**
     * Preload the native libraries for JCusolver
     */
    public static void preloadCusolver()
    {
        logger.log(level, "Preloading Cusolver...");
        Cusolver.preload();
        logger.log(level, "Preloading Cusolver DONE");
    }
    
    /**
     * Preload the native libraries for JCurand
     */
    public static void preloadCurand()
    {
        logger.log(level, "Preloading Curand...");
        Curand.preload();
        logger.log(level, "Preloading Curand DONE");
    }
    
    /**
     * Preload the native libraries for JCudnn
     */
    public static void preloadCudnn()
    {
        logger.log(level, "Preloading Cudnn...");
        Cudnn.preload();
        logger.log(level, "Preloading Cudnn DONE");
    }
    
    /**
     * Private constructor to prevent instantiation.
     */
    private JCudaJavaCppPreloads()
    {
        // Private constructor to prevent instantiation.
    }
    

}
