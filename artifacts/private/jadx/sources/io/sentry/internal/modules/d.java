package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.m1;
import io.sentry.y7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public abstract class d implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f305631d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f305632e = "sentry-external-modules.txt";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    protected final ILogger f305633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f305634b = new io.sentry.util.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private volatile Map<String, String> f305635c = null;

    public d(@NotNull ILogger iLogger) {
        this.f305633a = iLogger;
    }

    @Override // io.sentry.internal.modules.b
    @Nullable
    public Map<String, String> a() {
        if (this.f305635c == null) {
            m1 m1VarA = this.f305634b.a();
            try {
                if (this.f305635c == null) {
                    this.f305635c = b();
                }
                if (m1VarA != null) {
                    m1VarA.close();
                }
            } catch (Throwable th2) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return this.f305635c;
    }

    protected abstract Map<String, String> b();

    protected Map<String, String> c(@NotNull InputStream inputStream) {
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f305631d));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                this.f305633a.c(y7.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            this.f305633a.a(y7.ERROR, "Error extracting modules.", e10);
            return treeMap;
        } catch (RuntimeException e11) {
            this.f305633a.b(y7.ERROR, e11, "%s file is malformed.", f305632e);
            return treeMap;
        }
    }
}
