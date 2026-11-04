package io.intercom.android.sdk.lightcompressor.utils;

import android.util.Log;
import io.intercom.android.sdk.lightcompressor.data.AtomsKt;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nStreamableVideo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamableVideo.kt\nio/intercom/android/sdk/lightcompressor/utils/StreamableVideo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n1#2:221\n*E\n"})
public final class StreamableVideo {
    private static final int ATOM_PREAMBLE_SIZE = 8;

    @NotNull
    public static final StreamableVideo INSTANCE = new StreamableVideo();

    @NotNull
    private static final String tag = "StreamableVideo";

    private StreamableVideo() {
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    private final boolean convert(FileChannel fileChannel, FileChannel fileChannel2) throws Exception {
        boolean z10;
        FileChannel fileChannel3;
        int i10 = 8;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        long jUInt32ToLong = 0;
        ByteBuffer byteBuffer = null;
        int i11 = 0;
        long jPosition = 0;
        do {
            Intrinsics.checkNotNull(byteBufferOrder);
            if (readAndFill(fileChannel, byteBufferOrder)) {
                jUInt32ToLong = NumbersUtilsKt.uInt32ToLong(byteBufferOrder.getInt());
                i11 = byteBufferOrder.getInt();
                if (i11 == AtomsKt.getFTYP_ATOM()) {
                    int iUInt32ToInt = NumbersUtilsKt.uInt32ToInt(jUInt32ToLong);
                    ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(iUInt32ToInt).order(ByteOrder.BIG_ENDIAN);
                    byteBufferOrder.rewind();
                    byteBufferOrder2.put(byteBufferOrder);
                    if (fileChannel.read(byteBufferOrder2) >= iUInt32ToInt - 8) {
                        byteBufferOrder2.flip();
                        jPosition = fileChannel.position();
                        Unit unit = Unit.f312394a;
                        byteBuffer = byteBufferOrder2;
                        z10 = false;
                        if (i11 == AtomsKt.getFREE_ATOM() && i11 != AtomsKt.getJUNK_ATOM() && i11 != AtomsKt.getMDAT_ATOM() && i11 != AtomsKt.getMOOV_ATOM() && i11 != AtomsKt.getPNOT_ATOM() && i11 != AtomsKt.getSKIP_ATOM() && i11 != AtomsKt.getWIDE_ATOM() && i11 != AtomsKt.getPICT_ATOM() && i11 != AtomsKt.getUUID_ATOM() && i11 != AtomsKt.getFTYP_ATOM()) {
                            Log.wtf(tag, "encountered non-QT top-level atom (is this a QuickTime file?)");
                            break;
                        }
                    } else {
                        byteBuffer = byteBufferOrder2;
                    }
                } else {
                    if (jUInt32ToLong == 1) {
                        byteBufferOrder.clear();
                        if (readAndFill(fileChannel, byteBufferOrder)) {
                            jUInt32ToLong = NumbersUtilsKt.uInt64ToLong(byteBufferOrder.getLong());
                            z10 = false;
                            fileChannel.position((fileChannel.position() + jUInt32ToLong) - ((long) 16));
                        }
                    } else {
                        z10 = false;
                        fileChannel.position((fileChannel.position() + jUInt32ToLong) - ((long) 8));
                    }
                    if (i11 == AtomsKt.getFREE_ATOM()) {
                    }
                }
            }
            z10 = false;
            break;
        } while (jUInt32ToLong >= 8);
        if (i11 != AtomsKt.getMOOV_ATOM()) {
            Log.wtf(tag, "last atom in file was not a moov atom");
            return z10;
        }
        int iUInt32ToInt2 = NumbersUtilsKt.uInt32ToInt(jUInt32ToLong);
        long j10 = iUInt32ToInt2;
        long size = fileChannel.size() - j10;
        ByteBuffer byteBufferOrder3 = ByteBuffer.allocate(iUInt32ToInt2).order(ByteOrder.BIG_ENDIAN);
        if (!readAndFill(fileChannel, byteBufferOrder3, size)) {
            throw new Exception("failed to read moov atom");
        }
        if (byteBufferOrder3.getInt(12) == AtomsKt.getCMOV_ATOM()) {
            throw new Exception("this utility does not support compressed moov atoms yet");
        }
        while (byteBufferOrder3.remaining() >= i10) {
            int iPosition = byteBufferOrder3.position();
            int i12 = byteBufferOrder3.getInt(iPosition + 4);
            if (i12 == AtomsKt.getSTCO_ATOM() || i12 == AtomsKt.getCO64_ATOM()) {
                int i13 = iUInt32ToInt2;
                if (NumbersUtilsKt.uInt32ToLong(byteBufferOrder3.getInt(iPosition)) > byteBufferOrder3.remaining()) {
                    throw new Exception("bad atom size");
                }
                byteBufferOrder3.position(iPosition + 12);
                if (byteBufferOrder3.remaining() < 4) {
                    throw new Exception("malformed atom");
                }
                int iUInt32ToInt3 = NumbersUtilsKt.uInt32ToInt(byteBufferOrder3.getInt());
                if (i12 == AtomsKt.getSTCO_ATOM()) {
                    if (byteBufferOrder3.remaining() < iUInt32ToInt3 * 4) {
                        throw new Exception("bad atom size/element count");
                    }
                    for (?? r10 = z10; r10 < iUInt32ToInt3; r10++) {
                        int i14 = byteBufferOrder3.getInt(byteBufferOrder3.position());
                        int i15 = i14 + i13;
                        if (i14 < 0 && i15 >= 0) {
                            throw new Exception("This is bug in original qt-faststart.c: stco atom should be extended to co64 atom as new offset value overflows uint32, but is not implemented.");
                        }
                        byteBufferOrder3.putInt(i15);
                    }
                } else if (i12 == AtomsKt.getCO64_ATOM()) {
                    Log.wtf(tag, "patching co64 atom...");
                    if (byteBufferOrder3.remaining() < iUInt32ToInt3 * 8) {
                        throw new Exception("bad atom size/element count");
                    }
                    ?? r11 = z10;
                    while (r11 < iUInt32ToInt3) {
                        byteBufferOrder3.putLong(byteBufferOrder3.getLong(byteBufferOrder3.position()) + j10);
                        r11 = (r11 == true ? 1 : 0) + 1;
                    }
                }
                iUInt32ToInt2 = i13;
                i10 = 8;
            } else {
                byteBufferOrder3.position(byteBufferOrder3.position() + 1);
            }
        }
        fileChannel.position(jPosition);
        if (byteBuffer != null) {
            byteBuffer.rewind();
            fileChannel3 = fileChannel2;
            fileChannel3.write(byteBuffer);
        } else {
            fileChannel3 = fileChannel2;
        }
        byteBufferOrder3.rewind();
        fileChannel3.write(byteBufferOrder3);
        fileChannel.transferTo(jPosition, size - jPosition, fileChannel3);
        return true;
    }

    private final boolean readAndFill(FileChannel fileChannel, ByteBuffer byteBuffer) throws IOException {
        byteBuffer.clear();
        int i10 = fileChannel.read(byteBuffer);
        byteBuffer.flip();
        return i10 == byteBuffer.capacity();
    }

    private final void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.wtf(tag, "Failed to close file: ");
            }
        }
    }

    public final boolean start(@Nullable File file, @NotNull File out) throws Throwable {
        FileOutputStream fileOutputStream;
        Intrinsics.checkNotNullParameter(out, "out");
        Closeable closeable = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                fileOutputStream = new FileOutputStream(out);
                try {
                    FileChannel channel2 = fileOutputStream.getChannel();
                    Intrinsics.checkNotNull(channel);
                    Intrinsics.checkNotNull(channel2);
                    boolean zConvert = convert(channel, channel2);
                    safeClose(fileInputStream);
                    safeClose(fileOutputStream);
                    if (!zConvert) {
                        out.delete();
                    }
                    return zConvert;
                } catch (Throwable th2) {
                    th = th2;
                    closeable = fileInputStream;
                    safeClose(closeable);
                    safeClose(fileOutputStream);
                    out.delete();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private final boolean readAndFill(FileChannel fileChannel, ByteBuffer byteBuffer, long j10) throws IOException {
        byteBuffer.clear();
        int i10 = fileChannel.read(byteBuffer, j10);
        byteBuffer.flip();
        return i10 == byteBuffer.capacity();
    }
}
