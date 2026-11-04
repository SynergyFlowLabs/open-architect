package com.activeandroid.util;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class Tokenizer {
    private int mCurrent;
    private boolean mIsNext;
    private final InputStream mStream;

    public Tokenizer(InputStream inputStream) {
        this.mStream = inputStream;
    }

    public boolean hasNext() throws IOException {
        if (!this.mIsNext) {
            this.mIsNext = true;
            this.mCurrent = this.mStream.read();
        }
        return this.mCurrent != -1;
    }

    public int next() throws IOException {
        if (!this.mIsNext) {
            this.mCurrent = this.mStream.read();
        }
        this.mIsNext = false;
        return this.mCurrent;
    }

    public boolean skip(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (str.charAt(0) != this.mCurrent) {
            return false;
        }
        int length = str.length();
        this.mStream.mark(length - 1);
        for (int i10 = 1; i10 < length; i10++) {
            if (this.mStream.read() != str.charAt(i10)) {
                this.mStream.reset();
                return false;
            }
        }
        return true;
    }
}
