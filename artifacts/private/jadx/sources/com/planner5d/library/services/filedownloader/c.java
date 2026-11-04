package com.planner5d.library.services.filedownloader;

import android.app.Application;
import androidx.annotation.f1;
import com.planner5d.library.services.backgroundexecutor.g;
import com.planner5d.library.services.download.i;
import com.planner5d.library.services.download.j;
import com.planner5d.library.services.download.l;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.i1;
import com.planner5d.library.services.utility.o2;
import ij.f;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
@f
public class c extends com.planner5d.library.services.backgroundexecutor.b<e, File> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f224317g = "corrupted";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Application f224318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c2 f224319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i1 f224320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.d.g f224321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f224322f;

    public interface a {
        Exception a(@f1 int message, String... parameters);
    }

    @ij.a
    public c(Application application, c2 networkStateUtility, i1 internetStateMonitor, com.planner5d.library.services.bitmaploader.d.g uriLoader, a responseExceptionFactory, g messageSender) {
        super(messageSender);
        this.f224318b = application;
        this.f224319c = networkStateUtility;
        this.f224320d = internetStateMonitor;
        this.f224321e = uriLoader;
        this.f224322f = responseExceptionFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ File f(File file, String str, long j10, com.planner5d.library.services.download.g gVar) throws Throwable {
        return b(new e(a(), gVar.b(), file, str), j10);
    }

    @e.a({"StringFormatInvalid"})
    public File g(com.planner5d.library.services.download.g[] uris, File file, String fileHash, final long timeout) throws Throwable {
        final File file2;
        final String str;
        try {
            file2 = file;
            try {
                str = fileHash;
                try {
                    return (File) this.f224321e.a(this.f224318b, uris, new l() { // from class: com.planner5d.library.services.filedownloader.b
                        @Override // com.planner5d.library.services.download.l
                        public final Object a(com.planner5d.library.services.download.g gVar) {
                            return this.f224313a.f(file2, str, timeout, gVar);
                        }
                    }, this.f224319c, this.f224320d);
                } catch (i unused) {
                    throw new IOException(this.f224318b.getString(o2.q.f227964g8, file2.getName(), str));
                } catch (j unused2) {
                    throw new IOException(this.f224318b.getString(o2.q.f227940f8, file2.getName(), str));
                }
            } catch (i unused3) {
                str = fileHash;
                throw new IOException(this.f224318b.getString(o2.q.f227964g8, file2.getName(), str));
            } catch (j unused4) {
                str = fileHash;
                throw new IOException(this.f224318b.getString(o2.q.f227940f8, file2.getName(), str));
            }
        } catch (i unused5) {
            file2 = file;
        } catch (j unused6) {
            file2 = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.services.backgroundexecutor.b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public File c(e message) throws Exception {
        int i10 = message.f224332e;
        if (i10 == 0) {
            return message.f224330c;
        }
        String str = message.f224333f;
        throw (str == null ? this.f224322f.a(i10, new String[0]) : this.f224322f.a(i10, str));
    }
}
