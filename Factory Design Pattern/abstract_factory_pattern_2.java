// TODO: Define the abstract class MusicFile with an abstract play method
public abstract class MusicFile {

    // TODO: Declare the abstract method play()
    public abstract void play();
}

// TODO: Define MP3File class which extends MusicFile
public class MP3File extends MusicFile {

    // TODO: Implement the play method to print "Playing MP3 File."
    @Override
    public void play() {
        System.out.println("Playing MP3 File.");
    }
}

// TODO: Define WAVFile class which extends MusicFile
public class WAVFile extends MusicFile {

    // TODO: Implement the play method to print "Playing WAV File."
    @Override
    public void play() {
        System.out.println("Playing WAV File.");
    }
}

// TODO: Define FLACFile class which extends MusicFile
public class FLACFile extends MusicFile {

    // TODO: Implement the play method to print "Playing FLAC File."
    @Override
    public void play() {
        System.out.println("Playing FLAC File.");
    }
}

// TODO: Define the MusicFileAbstractFactory interface with a createMusicFile method
public interface MusicFileAbstractFactory {

    // TODO: Declare the abstract method createMusicFile()
    MusicFile createMusicFile();
}

// TODO: Define the MusicFileAbstractFactory interface with a createMusicFile method
public interface MusicFileAbstractFactory {

    // TODO: Declare the abstract method createMusicFile()
    MusicFile createMusicFile();
}

// TODO: Define MP3FileFactory class which implements MusicFileAbstractFactory
public class MP3FileFactory implements MusicFileAbstractFactory {

    // TODO: Implement the createMusicFile method to return a new MP3File instance
    @Override
    public MusicFile createMusicFile() {
        return new MP3File();
    }
}

// TODO: Define WAVFileFactory class which implements MusicFileAbstractFactory
public class WAVFileFactory implements MusicFileAbstractFactory {

    // TODO: Implement the createMusicFile method to return a new WAVFile instance
    @Override
    public MusicFile createMusicFile() {
        return new WAVFile();
    }
}

// TODO: Define FLACFileFactory class which implements MusicFileAbstractFactory
public class FLACFileFactory implements MusicFileAbstractFactory {

    // TODO: Implement the createMusicFile method to return a new FLACFile instance
    @Override
    public MusicFile createMusicFile() {
        return new FLACFile();
    }
}

// TODO: Define MusicFileFactory class with a static createMusicFile method
public class MusicFileFactory {

    // TODO: Implement the createMusicFile method to utilize a factory to create a music file
    public static MusicFile createMusicFile(MusicFileAbstractFactory factory) {
        return factory.createMusicFile();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an MP3 File
        // TODO: Create an MP3File using MusicFileFactory and the respective factory
        MusicFile mp3 = MusicFileFactory.createMusicFile(new MP3FileFactory());
        // TODO: Call play method on the created MP3File
        mp3.play();

        // Create a WAV File
        // TODO: Create a WAVFile using MusicFileFactory and the respective factory
        MusicFile wav = MusicFileFactory.createMusicFile(new WAVFileFactory());
        // TODO: Call play method on the created WAVFile
        wav.play();

        // Create a FLAC File
        // TODO: Create a FLACFile using MusicFileFactory and the respective factory
        MusicFile flac = MusicFileFactory.createMusicFile(new FLACFileFactory());
        // TODO: Call play method on the created FLACFile
        flac.play();
    }
}