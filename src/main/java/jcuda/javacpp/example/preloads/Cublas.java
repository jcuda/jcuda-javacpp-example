/*
 * JCuda - Java bindings for NVIDIA CUDA driver and runtime API
 * http://www.jcuda.org
 *
 * Copyright 2020 Marco Hutter - http://www.jcuda.org
 */
package jcuda.javacpp.example.preloads;

import org.bytedeco.javacpp.Loader;

/**
 * Loader class for cublas
 */
class Cublas extends org.bytedeco.cuda.presets.cublas
{
    /**
     * Preload the library
     */
    static void preload()
    {
        Loader.load();
    }
}