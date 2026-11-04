package com.google.common.io;

import com.google.common.base.v0;
import com.google.common.collect.l6;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final j0 f119021a = c();

    private static final class b extends j0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f119022b = 10000;

        private b() {
            super();
        }

        @Override // com.google.common.io.j0
        File a() {
            File file = new File(com.google.common.base.p0.JAVA_IO_TMPDIR.n());
            String str = System.currentTimeMillis() + "-";
            for (int i10 = 0; i10 < 10000; i10++) {
                File file2 = new File(file, str + i10);
                if (file2.mkdir()) {
                    return file2;
                }
            }
            throw new IllegalStateException("Failed to create directory within 10000 attempts (tried " + str + "0 to " + str + org.threeten.bp.chrono.m.f339905m + ')');
        }

        @Override // com.google.common.io.j0
        File b(String prefix) throws IOException {
            return File.createTempFile(prefix, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @w
    static final class c extends j0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final b f119023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b f119024c;

        class a implements FileAttribute<l6<AclEntry>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l6 f119025a;

            a(final l6 val$acl) {
                this.f119025a = val$acl;
            }

            @Override // java.nio.file.attribute.FileAttribute
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l6<AclEntry> value() {
                return this.f119025a;
            }

            @Override // java.nio.file.attribute.FileAttribute
            public String name() {
                return "acl:acl";
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @w
        interface b {
            FileAttribute<?> get() throws IOException;
        }

        static {
            Set<String> setSupportedFileAttributeViews = FileSystems.getDefault().supportedFileAttributeViews();
            if (setSupportedFileAttributeViews.contains("posix")) {
                f119023b = new b() { // from class: com.google.common.io.k0
                    @Override // com.google.common.io.j0.c.b
                    public final FileAttribute get() {
                        return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rw-------"));
                    }
                };
                f119024c = new b() { // from class: com.google.common.io.l0
                    @Override // com.google.common.io.j0.c.b
                    public final FileAttribute get() {
                        return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rwx------"));
                    }
                };
            } else if (setSupportedFileAttributeViews.contains("acl")) {
                b bVarL = l();
                f119024c = bVarL;
                f119023b = bVarL;
            } else {
                b bVar = new b() { // from class: com.google.common.io.m0
                    @Override // com.google.common.io.j0.c.b
                    public final FileAttribute get() {
                        return j0.c.h();
                    }
                };
                f119024c = bVar;
                f119023b = bVar;
            }
        }

        private c() {
            super();
        }

        public static /* synthetic */ FileAttribute g(FileAttribute fileAttribute) {
            return fileAttribute;
        }

        public static /* synthetic */ FileAttribute h() throws IOException {
            throw new IOException("unrecognized FileSystem type " + FileSystems.getDefault());
        }

        public static /* synthetic */ FileAttribute i(IOException iOException) throws IOException {
            throw new IOException("Could not find user", iOException);
        }

        private static String k() {
            String strN = com.google.common.base.p0.USER_NAME.n();
            Objects.requireNonNull(strN);
            try {
                Class<?> cls = Class.forName("java.lang.ProcessHandle");
                Class<?> cls2 = Class.forName("java.lang.ProcessHandle$Info");
                Class<?> cls3 = Class.forName("java.util.Optional");
                Method method = cls.getMethod(io.sentry.protocol.b0.b.f306151f, null);
                Method method2 = cls.getMethod("info", null);
                Object objInvoke = cls3.getMethod("orElse", Object.class).invoke(cls2.getMethod("user", null).invoke(method2.invoke(method.invoke(null, null), null), null), strN);
                Objects.requireNonNull(objInvoke);
                return (String) objInvoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException unused) {
                return strN;
            } catch (InvocationTargetException e10) {
                v0.w(e10.getCause());
                return strN;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b l() {
            try {
                final a aVar = new a(l6.G(AclEntry.newBuilder().setType(AclEntryType.ALLOW).setPrincipal(FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName(k())).setPermissions(EnumSet.allOf(AclEntryPermission.class)).setFlags(AclEntryFlag.DIRECTORY_INHERIT, AclEntryFlag.FILE_INHERIT).build()));
                return new b() { // from class: com.google.common.io.n0
                    @Override // com.google.common.io.j0.c.b
                    public final FileAttribute get() {
                        return j0.c.g(aVar);
                    }
                };
            } catch (IOException e10) {
                return new b() { // from class: com.google.common.io.o0
                    @Override // com.google.common.io.j0.c.b
                    public final FileAttribute get() {
                        return j0.c.i(e10);
                    }
                };
            }
        }

        @Override // com.google.common.io.j0
        File a() {
            try {
                return Files.createTempDirectory(Paths.get(com.google.common.base.p0.JAVA_IO_TMPDIR.n(), new String[0]), null, f119024c.get()).toFile();
            } catch (IOException e10) {
                throw new IllegalStateException("Failed to create directory", e10);
            }
        }

        @Override // com.google.common.io.j0
        File b(String prefix) throws IOException {
            return Files.createTempFile(Paths.get(com.google.common.base.p0.JAVA_IO_TMPDIR.n(), new String[0]), prefix, null, f119023b.get()).toFile();
        }
    }

    private static final class d extends j0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f119026b = "Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().";

        private d() {
            super();
        }

        @Override // com.google.common.io.j0
        File a() {
            throw new IllegalStateException(f119026b);
        }

        @Override // com.google.common.io.j0
        File b(String prefix) throws IOException {
            throw new IOException(f119026b);
        }
    }

    private static j0 c() {
        try {
            try {
                return new c();
            } catch (ClassNotFoundException unused) {
                return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue() < ((Integer) Class.forName("android.os.Build$VERSION_CODES").getField("JELLY_BEAN").get(null)).intValue() ? new d() : new b();
            }
        } catch (ClassNotFoundException unused2) {
            return new d();
        } catch (IllegalAccessException unused3) {
            return new d();
        } catch (NoSuchFieldException unused4) {
            return new d();
        }
    }

    @w
    @com.google.common.annotations.e
    static void d() throws IOException {
        c.l().get();
    }

    abstract File a();

    abstract File b(String prefix) throws IOException;

    private j0() {
    }
}
