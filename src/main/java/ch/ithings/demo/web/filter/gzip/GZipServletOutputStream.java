package ch.ithings.demo.web.filter.gzip;

import javax.servlet.ServletOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.WriteListener;

class GZipServletOutputStream extends ServletOutputStream {
    private OutputStream stream;

    public GZipServletOutputStream(OutputStream output)
            throws IOException {
        super();
        this.stream = output;
    }

    @Override
    public void close() throws IOException {
        this.stream.close();
    }

    @Override
    public void flush() throws IOException {
        this.stream.flush();
    }

    @Override
    public void write(byte b[]) throws IOException {
        this.stream.write(b);
    }

    @Override
    public void write(byte b[], int off, int len) throws IOException {
        this.stream.write(b, off, len);
    }

    @Override
    public void write(int b) throws IOException {
        this.stream.write(b);
    }

    @Override
    public boolean isReady() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setWriteListener(WriteListener wl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
