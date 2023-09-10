package com.tcs.guest.filters;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;

import org.springframework.util.Assert;

public class MyDelegatingServletInputStream extends ServletInputStream {
	private final InputStream sourceStream;

	private boolean finished = false;

	public MyDelegatingServletInputStream(InputStream sourceStream) {
		Assert.notNull(sourceStream, "Source InputStream must not be null");
		this.sourceStream = sourceStream;
	}

	
	public final InputStream getSourceStream() {
		return this.sourceStream;
	}

	@Override
	public int read() throws IOException {
		int data = this.sourceStream.read();
		if (data == -1) {
			this.finished = true;
		}
		return data;
	}

	@Override
	public int available() throws IOException {
		return this.sourceStream.available();
	}

	@Override
	public void close() throws IOException {
		super.close();
		this.sourceStream.close();
	}

	@Override
	public boolean isFinished() {
		return this.finished;
	}

	@Override
	public boolean isReady() {
		return true;
	}

	@Override
	public void setReadListener(ReadListener readListener) {
		throw new UnsupportedOperationException();
	}
}
