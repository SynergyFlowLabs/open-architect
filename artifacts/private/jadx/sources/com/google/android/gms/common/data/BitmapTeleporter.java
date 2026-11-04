package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "BitmapTeleporterCreator")
@a0
@g6.a
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    @g6.a
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f106359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    @p0
    ParcelFileDescriptor f106360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    final int f106361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Bitmap f106362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f106363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private File f106364f;

    @SafeParcelable.b
    BitmapTeleporter(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.e(id = 3) int i11) {
        this.f106359a = i10;
        this.f106360b = parcelFileDescriptor;
        this.f106361c = i11;
        this.f106362d = null;
        int i12 = 3 >> 0;
        this.f106363e = false;
    }

    private static final void b2(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @p0
    @g6.a
    public Bitmap O1() {
        if (!this.f106363e) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) w.r(this.f106360b)));
            try {
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    int i10 = dataInputStream.readInt();
                    int i11 = dataInputStream.readInt();
                    Bitmap.Config configValueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                    dataInputStream.read(bArr);
                    b2(dataInputStream);
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, configValueOf);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferWrap);
                    this.f106362d = bitmapCreateBitmap;
                    this.f106363e = true;
                } catch (IOException e10) {
                    throw new IllegalStateException("Could not read from parcel file descriptor", e10);
                }
            } catch (Throwable th2) {
                b2(dataInputStream);
                throw th2;
            }
        }
        return this.f106362d;
    }

    @g6.a
    public void T1(@NonNull File file) {
        if (file == null) {
            throw new NullPointerException("Cannot set null temp directory");
        }
        this.f106364f = file;
    }

    @g6.a
    public void release() {
        if (this.f106363e) {
            return;
        }
        try {
            ((ParcelFileDescriptor) w.r(this.f106360b)).close();
        } catch (IOException unused) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (this.f106360b == null) {
            Bitmap bitmap = (Bitmap) w.r(this.f106362d);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            File file = this.f106364f;
            if (file == null) {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
            try {
                File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    this.f106360b = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                    fileCreateTempFile.delete();
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                    try {
                        try {
                            dataOutputStream.writeInt(bArrArray.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(bArrArray);
                            b2(dataOutputStream);
                        } catch (IOException e10) {
                            throw new IllegalStateException("Could not write into unlinked file", e10);
                        }
                    } catch (Throwable th2) {
                        b2(dataOutputStream);
                        throw th2;
                    }
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e11) {
                throw new IllegalStateException("Could not create temporary file", e11);
            }
        }
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f106359a);
        i6.b.S(parcel, 2, this.f106360b, i10 | 1, false);
        i6.b.F(parcel, 3, this.f106361c);
        i6.b.b(parcel, iA);
        this.f106360b = null;
    }

    @g6.a
    public BitmapTeleporter(@NonNull Bitmap bitmap) {
        this.f106359a = 1;
        this.f106360b = null;
        this.f106361c = 0;
        this.f106362d = bitmap;
        this.f106363e = true;
    }
}
