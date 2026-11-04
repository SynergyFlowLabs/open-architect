package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements e<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f96339a;

    @w0(21)
    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<ParcelFileDescriptor> b(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new m(parcelFileDescriptor);
        }
    }

    @w0(21)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ParcelFileDescriptor f96340a;

        b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f96340a = parcelFileDescriptor;
        }

        ParcelFileDescriptor a() throws IOException {
            try {
                Os.lseek(this.f96340a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f96340a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    @w0(21)
    public m(ParcelFileDescriptor parcelFileDescriptor) {
        this.f96339a = new b(parcelFileDescriptor);
    }

    public static boolean c() {
        return true;
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    @w0(21)
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor a() throws IOException {
        return this.f96339a.a();
    }
}
