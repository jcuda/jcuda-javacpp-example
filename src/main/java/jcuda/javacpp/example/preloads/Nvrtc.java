package jcuda.javacpp.example.preloads;

import org.bytedeco.javacpp.Loader;

/**
 * Loader class for nvrtc
 */
class Nvrtc extends org.bytedeco.cuda.presets.nvrtc
{
    /**
     * Preload the library
     */
    static void preload()
    {
        Loader.load();
    }
}