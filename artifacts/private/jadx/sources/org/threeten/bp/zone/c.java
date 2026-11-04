package org.threeten.bp.zone;

import androidx.media3.common.x0;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.time.m;
import org.threeten.bp.p;
import org.threeten.bp.s;

/* JADX INFO: loaded from: classes14.dex */
final class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final org.threeten.bp.format.c f340475k = new org.threeten.bp.format.d().t(org.threeten.bp.temporal.a.f340353t).F().h(AbstractJsonLexerKt.COLON).u(org.threeten.bp.temporal.a.f340343m, 2).F().h(AbstractJsonLexerKt.COLON).u(org.threeten.bp.temporal.a.f340339k, 2).P();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, List<C2453c>> f340476a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, List<d>> f340477b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f340478c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SortedMap<String, g> f340479d = new TreeMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<Object, Object> f340480e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SortedMap<org.threeten.bp.g, Byte> f340481f = new TreeMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f340482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<File> f340483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final File f340484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f340485j;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.threeten.bp.g f340486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        byte f340487b;

        public a(org.threeten.bp.g gVar, byte b10) {
            this.f340486a = gVar;
            this.f340487b = b10;
        }
    }

    abstract class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.threeten.bp.d f340491d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f340493f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        org.threeten.bp.j f340488a = org.threeten.bp.j.JANUARY;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f340489b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f340490c = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.threeten.bp.i f340492e = org.threeten.bp.i.f340214g;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        f.b f340494g = f.b.WALL;

        b() {
        }

        void a(int i10) {
            int i11;
            if (this.f340490c || (i11 = this.f340489b) <= 0) {
                return;
            }
            org.threeten.bp.g gVarU0 = org.threeten.bp.g.D0(i10, this.f340488a, i11).u0(6L);
            this.f340489b = gVarU0.l0();
            this.f340488a = gVarU0.o0();
            this.f340490c = true;
        }
    }

    /* JADX INFO: renamed from: org.threeten.bp.zone.c$c, reason: collision with other inner class name */
    final class C2453c extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f340496i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f340497j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f340498k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        String f340499l;

        C2453c() {
            super();
        }

        void b(h hVar) {
            a(x0.f61816g3);
            hVar.a(this.f340496i, this.f340497j, this.f340488a, this.f340489b, this.f340491d, this.f340492e, this.f340493f, this.f340494g, this.f340498k);
        }
    }

    final class d extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        s f340501i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Integer f340502j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        String f340503k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        String f340504l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        p f340505m;

        d() {
            super();
        }

        private org.threeten.bp.h c(int i10) {
            org.threeten.bp.g gVarD0;
            a(i10);
            int i11 = this.f340489b;
            if (i11 == -1) {
                int iD = this.f340488a.D(p.O(i10));
                this.f340489b = iD;
                gVarD0 = org.threeten.bp.g.D0(i10, this.f340488a, iD);
                org.threeten.bp.d dVar = this.f340491d;
                if (dVar != null) {
                    gVarD0 = gVarD0.s(org.threeten.bp.temporal.h.m(dVar));
                }
            } else {
                gVarD0 = org.threeten.bp.g.D0(i10, this.f340488a, i11);
                org.threeten.bp.d dVar2 = this.f340491d;
                if (dVar2 != null) {
                    gVarD0 = gVarD0.s(org.threeten.bp.temporal.h.k(dVar2));
                }
            }
            return org.threeten.bp.h.H0((org.threeten.bp.g) c.this.c(gVarD0.K0(this.f340493f)), this.f340492e);
        }

        h b(h hVar, Map<String, List<C2453c>> map) {
            p pVar = this.f340505m;
            if (pVar != null) {
                hVar.e(this.f340501i, c(pVar.getValue()), this.f340494g);
            } else {
                hVar.f(this.f340501i);
            }
            Integer num = this.f340502j;
            if (num != null) {
                hVar.h(num.intValue());
                return hVar;
            }
            List<C2453c> list = map.get(this.f340503k);
            if (list != null) {
                Iterator<C2453c> it = list.iterator();
                while (it.hasNext()) {
                    it.next().b(hVar);
                }
                return hVar;
            }
            throw new IllegalArgumentException("Rule not found: " + this.f340503k);
        }
    }

    public c(String str, List<File> list, File file, boolean z10) {
        this.f340482g = str;
        this.f340483h = list;
        this.f340484i = file;
        this.f340485j = z10;
    }

    private f.b A(char c10) {
        if (c10 != 'G') {
            if (c10 != 'S') {
                if (c10 != 'U' && c10 != 'Z' && c10 != 'g') {
                    if (c10 != 's') {
                        if (c10 != 'u' && c10 != 'z') {
                            return f.b.WALL;
                        }
                    }
                }
            }
            return f.b.STANDARD;
        }
        return f.b.UTC;
    }

    private int B(String str, int i10) {
        String lowerCase = str.toLowerCase();
        if (h(lowerCase, "minimum")) {
            return p.f340293b;
        }
        if (h(lowerCase, "maximum")) {
            return p.f340294c;
        }
        return lowerCase.equals("only") ? i10 : Integer.parseInt(lowerCase);
    }

    private boolean C(StringTokenizer stringTokenizer, List<d> list) {
        d dVar = new d();
        list.add(dVar);
        dVar.f340501i = v(stringTokenizer.nextToken());
        String strW = w(stringTokenizer.nextToken());
        if (strW == null) {
            dVar.f340502j = 0;
            dVar.f340503k = null;
        } else {
            try {
                dVar.f340502j = Integer.valueOf(x(strW));
                dVar.f340503k = null;
            } catch (Exception unused) {
                dVar.f340502j = null;
                dVar.f340503k = strW;
            }
        }
        dVar.f340504l = stringTokenizer.nextToken();
        if (!stringTokenizer.hasMoreTokens()) {
            return true;
        }
        dVar.f340505m = p.a0(Integer.parseInt(stringTokenizer.nextToken()));
        if (stringTokenizer.hasMoreTokens()) {
            u(stringTokenizer, dVar);
        }
        return false;
    }

    private void D(String str) {
        if (this.f340485j) {
            System.out.println(str);
        }
    }

    private static void E(List<File> list, List<String> list2, File file, boolean z10, boolean z11) throws Throwable {
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        TreeSet treeSet = new TreeSet();
        HashSet hashSet = new HashSet();
        SortedMap<org.threeten.bp.g, Byte> sortedMap = null;
        for (File file2 : list) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                File file3 = new File(file2, it.next());
                if (file3.exists()) {
                    arrayList.add(file3);
                }
            }
            if (!arrayList.isEmpty()) {
                File file4 = new File(file2, "leapseconds");
                if (!file4.exists()) {
                    System.out.println("Version " + file2.getName() + " does not include leap seconds information.");
                    file4 = null;
                }
                String name = file2.getName();
                c cVar = new c(name, arrayList, file4, z11);
                cVar.F(map);
                try {
                    cVar.b();
                    SortedMap<String, g> sortedMapF = cVar.f();
                    SortedMap<org.threeten.bp.g, Byte> sortedMapD = cVar.d();
                    if (!z10) {
                        File file5 = new File(file, "threeten-TZDB-" + name + ".jar");
                        if (z11) {
                            System.out.println("Outputting file: " + file5);
                        }
                        i(file5, name, sortedMapF, sortedMapD);
                    }
                    treeMap.put(name, sortedMapF);
                    treeSet.addAll(sortedMapF.keySet());
                    hashSet.addAll(sortedMapF.values());
                    if (cVar.e() != null && (sortedMap == null || cVar.e().compareTo(sortedMap.lastKey()) > 0)) {
                        sortedMap = sortedMapD;
                    }
                } catch (Exception e10) {
                    System.out.println("Failed: " + e10.toString());
                    e10.printStackTrace();
                    System.exit(1);
                }
            }
        }
        if (z10) {
            if (z11) {
                System.out.println("Outputting combined files: " + file);
            }
            k(file, treeMap, treeSet, hashSet, sortedMap);
            return;
        }
        File file6 = new File(file, "threeten-TZDB-all.jar");
        if (z11) {
            System.out.println("Outputting combined file: " + file6);
        }
        j(file6, treeMap, treeSet, hashSet, sortedMap);
    }

    private void a() throws Exception {
        for (String str : this.f340477b.keySet()) {
            D("Building zone " + str);
            String str2 = (String) c(str);
            List<d> list = this.f340477b.get(str2);
            h hVar = new h();
            Iterator<d> it = list.iterator();
            while (it.hasNext()) {
                hVar = it.next().b(hVar, this.f340476a);
            }
            this.f340479d.put(str2, (g) c(hVar.j(str2, this.f340480e)));
        }
        Iterator<String> it2 = this.f340478c.keySet().iterator();
        while (it2.hasNext()) {
            String str3 = (String) c(it2.next());
            String str4 = this.f340478c.get(str3);
            D("Linking alias " + str3 + " to " + str4);
            g gVar = this.f340479d.get(str4);
            if (gVar == null) {
                String str5 = this.f340478c.get(str4);
                D("Relinking alias " + str3 + " to " + str5);
                gVar = this.f340479d.get(str5);
                if (gVar == null) {
                    throw new IllegalArgumentException("Alias '" + str3 + "' links to invalid zone '" + str5 + "' for '" + this.f340482g + "'");
                }
            }
            this.f340479d.put(str3, gVar);
        }
        this.f340479d.remove("UTC");
        this.f340479d.remove(m.f337525a);
        this.f340479d.remove("GMT0");
        this.f340479d.remove("GMT+0");
        this.f340479d.remove("GMT-0");
    }

    private org.threeten.bp.g e() {
        if (this.f340481f.isEmpty()) {
            return null;
        }
        return this.f340481f.lastKey();
    }

    public static void g(String[] strArr) throws Throwable {
        if (strArr.length < 2) {
            l();
            return;
        }
        File file = null;
        File file2 = null;
        String str = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (i10 < strArr.length) {
            String str2 = strArr[i10];
            if (!str2.startsWith("-")) {
                break;
            }
            if ("-srcdir".equals(str2)) {
                if (file != null || (i10 = i10 + 1) >= strArr.length) {
                    l();
                    return;
                } else {
                    file = new File(strArr[i10]);
                    i10++;
                }
            } else if ("-dstdir".equals(str2)) {
                if (file2 != null || (i10 = i10 + 1) >= strArr.length) {
                    l();
                    return;
                } else {
                    file2 = new File(strArr[i10]);
                    i10++;
                }
            } else if (!"-version".equals(str2)) {
                if (!"-unpacked".equals(str2)) {
                    if ("-verbose".equals(str2)) {
                        if (!z11) {
                            z11 = true;
                            i10++;
                        }
                    } else if (!"-help".equals(str2)) {
                        System.out.println("Unrecognised option: " + str2);
                    }
                    l();
                    return;
                }
                if (z10) {
                    l();
                    return;
                } else {
                    z10 = true;
                    i10++;
                }
            } else if (str != null || (i10 = i10 + 1) >= strArr.length) {
                l();
                return;
            } else {
                str = strArr[i10];
                i10++;
            }
        }
        if (file == null) {
            System.out.println("Source directory must be specified using -srcdir: " + file);
            return;
        }
        if (!file.isDirectory()) {
            System.out.println("Source does not exist or is not a directory: " + file);
            return;
        }
        if (file2 == null) {
            file2 = file;
        }
        List listAsList = Arrays.asList(Arrays.copyOfRange(strArr, i10, strArr.length));
        if (listAsList.isEmpty()) {
            System.out.println("Source filenames not specified, using default set");
            System.out.println("(africa antarctica asia australasia backward etcetera europe northamerica southamerica)");
            listAsList = Arrays.asList("africa", "antarctica", "asia", "australasia", "backward", "etcetera", "europe", "northamerica", "southamerica");
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            File file3 = new File(file, str);
            if (!file3.isDirectory()) {
                System.out.println("Version does not represent a valid source directory : " + file3);
                return;
            }
            arrayList.add(file3);
        } else {
            for (File file4 : file.listFiles()) {
                if (file4.isDirectory() && file4.getName().matches("[12][0-9][0-9][0-9][A-Za-z0-9._-]+")) {
                    arrayList.add(file4);
                }
            }
        }
        if (arrayList.isEmpty()) {
            System.out.println("Source directory contains no valid source folders: " + file);
            return;
        }
        if (!file2.exists() && !file2.mkdirs()) {
            System.out.println("Destination directory could not be created: " + file2);
            return;
        }
        if (file2.isDirectory()) {
            E(arrayList, listAsList, file2, z10, z11);
            return;
        }
        System.out.println("Destination is not a directory: " + file2);
    }

    private boolean h(String str, String str2) {
        return str.startsWith(str2.substring(0, 3)) && str2.startsWith(str) && str.length() <= str2.length();
    }

    private static void i(File file, String str, SortedMap<String, g> sortedMap, SortedMap<org.threeten.bp.g, Byte> sortedMap2) throws Throwable {
        TreeMap treeMap = new TreeMap();
        treeMap.put(str, sortedMap);
        j(file, treeMap, new TreeSet(sortedMap.keySet()), new HashSet(sortedMap.values()), sortedMap2);
    }

    private static void j(File file, Map<String, SortedMap<String, g>> map, Set<String> set, Set<g> set2, SortedMap<org.threeten.bp.g, Byte> sortedMap) throws Throwable {
        JarOutputStream jarOutputStream = null;
        try {
            try {
                try {
                    JarOutputStream jarOutputStream2 = new JarOutputStream(new FileOutputStream(file));
                    try {
                        n(jarOutputStream2, map, set, set2);
                        jarOutputStream2.close();
                    } catch (Exception e10) {
                        e = e10;
                        jarOutputStream = jarOutputStream2;
                        System.out.println("Failed: " + e.toString());
                        e.printStackTrace();
                        System.exit(1);
                        if (jarOutputStream != null) {
                            jarOutputStream.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        jarOutputStream = jarOutputStream2;
                        if (jarOutputStream != null) {
                            try {
                                jarOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused2) {
        }
    }

    private static void k(File file, Map<String, SortedMap<String, g>> map, Set<String> set, Set<g> set2, SortedMap<org.threeten.bp.g, Byte> sortedMap) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th2;
        File file2 = new File(file, "TZDB.dat");
        file2.delete();
        try {
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    m(fileOutputStream, map, set, set2);
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2 = th3;
                    if (fileOutputStream == null) {
                        throw th2;
                    }
                    fileOutputStream.close();
                    throw th2;
                }
            } catch (Exception e10) {
                System.out.println("Failed: " + e10.toString());
                e10.printStackTrace();
                System.exit(1);
            }
        } catch (Throwable th4) {
            fileOutputStream = null;
            th2 = th4;
        }
    }

    private static void l() {
        System.out.println("Usage: TzdbZoneRulesCompiler <options> <tzdb source filenames>");
        System.out.println("where options include:");
        System.out.println("   -srcdir <directory>   Where to find source directories (required)");
        System.out.println("   -dstdir <directory>   Where to output generated files (default srcdir)");
        System.out.println("   -version <version>    Specify the version, such as 2009a (optional)");
        System.out.println("   -unpacked             Generate dat files without jar files");
        System.out.println("   -help                 Print this usage message");
        System.out.println("   -verbose              Output verbose information during compilation");
        System.out.println(" There must be one directory for each version in srcdir");
        System.out.println(" Each directory must have the name of the version, such as 2009a");
        System.out.println(" Each directory must contain the unpacked tzdb files, such as asia or europe");
        System.out.println(" Directories must match the regex [12][0-9][0-9][0-9][A-Za-z0-9._-]+");
        System.out.println(" There will be one jar file for each version and one combined jar in dstdir");
        System.out.println(" If the version is specified, only that version is processed");
    }

    private static void m(OutputStream outputStream, Map<String, SortedMap<String, g>> map, Set<String> set, Set<g> set2) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeByte(1);
        dataOutputStream.writeUTF("TZDB");
        String[] strArr = (String[]) map.keySet().toArray(new String[map.size()]);
        dataOutputStream.writeShort(strArr.length);
        for (String str : strArr) {
            dataOutputStream.writeUTF(str);
        }
        String[] strArr2 = (String[]) set.toArray(new String[set.size()]);
        dataOutputStream.writeShort(strArr2.length);
        for (String str2 : strArr2) {
            dataOutputStream.writeUTF(str2);
        }
        ArrayList<g> arrayList = new ArrayList(set2);
        dataOutputStream.writeShort(arrayList.size());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        for (g gVar : arrayList) {
            byteArrayOutputStream.reset();
            DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
            org.threeten.bp.zone.a.e(gVar, dataOutputStream2);
            dataOutputStream2.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            dataOutputStream.writeShort(byteArray.length);
            dataOutputStream.write(byteArray);
        }
        for (String str3 : map.keySet()) {
            dataOutputStream.writeShort(map.get(str3).size());
            for (Map.Entry<String, g> entry : map.get(str3).entrySet()) {
                int iBinarySearch = Arrays.binarySearch(strArr2, entry.getKey());
                int iIndexOf = arrayList.indexOf(entry.getValue());
                dataOutputStream.writeShort(iBinarySearch);
                dataOutputStream.writeShort(iIndexOf);
            }
        }
        dataOutputStream.flush();
    }

    private static void n(JarOutputStream jarOutputStream, Map<String, SortedMap<String, g>> map, Set<String> set, Set<g> set2) {
        try {
            jarOutputStream.putNextEntry(new ZipEntry("org/threeten/bp/TZDB.dat"));
            m(jarOutputStream, map, set, set2);
            jarOutputStream.closeEntry();
        } catch (Exception e10) {
            System.out.println("Failed: " + e10.toString());
            e10.printStackTrace();
            System.exit(1);
        }
    }

    private org.threeten.bp.d o(String str) {
        String lowerCase = str.toLowerCase();
        for (org.threeten.bp.d dVar : org.threeten.bp.d.values()) {
            if (h(lowerCase, dVar.name().toLowerCase())) {
                return dVar;
            }
        }
        throw new IllegalArgumentException("Unknown day-of-week: " + lowerCase);
    }

    private void p(File file) throws Exception {
        int i10 = 1;
        BufferedReader bufferedReader = null;
        String str = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            ArrayList arrayList = null;
            String line = null;
            while (true) {
                try {
                    try {
                        line = bufferedReader2.readLine();
                        if (line == null) {
                            bufferedReader2.close();
                            return;
                        }
                        int iIndexOf = line.indexOf(35);
                        if (iIndexOf >= 0) {
                            line = line.substring(0, iIndexOf);
                        }
                        if (line.trim().length() != 0) {
                            StringTokenizer stringTokenizer = new StringTokenizer(line, " \t");
                            if (arrayList != null && Character.isWhitespace(line.charAt(0)) && stringTokenizer.hasMoreTokens()) {
                                if (C(stringTokenizer, arrayList)) {
                                    arrayList = null;
                                }
                            } else if (stringTokenizer.hasMoreTokens()) {
                                String strNextToken = stringTokenizer.nextToken();
                                if (strNextToken.equals("Zone")) {
                                    if (stringTokenizer.countTokens() < 3) {
                                        D("Invalid Zone line in file: " + file + ", line: " + line);
                                        throw new IllegalArgumentException("Invalid Zone line");
                                    }
                                    arrayList = new ArrayList();
                                    this.f340477b.put(stringTokenizer.nextToken(), arrayList);
                                    if (C(stringTokenizer, arrayList)) {
                                    }
                                } else if (strNextToken.equals("Rule")) {
                                    if (stringTokenizer.countTokens() < 9) {
                                        D("Invalid Rule line in file: " + file + ", line: " + line);
                                        throw new IllegalArgumentException("Invalid Rule line");
                                    }
                                    y(stringTokenizer);
                                } else {
                                    if (!strNextToken.equals("Link")) {
                                        throw new IllegalArgumentException("Unknown line");
                                    }
                                    if (stringTokenizer.countTokens() < 2) {
                                        D("Invalid Link line in file: " + file + ", line: " + line);
                                        throw new IllegalArgumentException("Invalid Link line");
                                    }
                                    this.f340478c.put(stringTokenizer.nextToken(), stringTokenizer.nextToken());
                                }
                                arrayList = null;
                            } else {
                                continue;
                            }
                        }
                        i10++;
                    } catch (Exception e10) {
                        e = e10;
                        str = line;
                        throw new Exception("Failed while processing file '" + file + "' on line " + i10 + " '" + str + "'", e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void q() throws Exception {
        for (File file : this.f340483h) {
            D("Parsing file: " + file);
            p(file);
        }
    }

    private a r(String str) {
        byte b10;
        StringTokenizer stringTokenizer = new StringTokenizer(str, " \t");
        if (!stringTokenizer.nextToken().equals("Leap")) {
            throw new IllegalArgumentException("Unknown line");
        }
        if (stringTokenizer.countTokens() < 6) {
            D("Invalid leap second line in file: " + this.f340484i + ", line: " + str);
            throw new IllegalArgumentException("Invalid leap second line");
        }
        org.threeten.bp.g gVarD0 = org.threeten.bp.g.D0(Integer.parseInt(stringTokenizer.nextToken()), t(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
        String strNextToken = stringTokenizer.nextToken();
        String strNextToken2 = stringTokenizer.nextToken();
        if (strNextToken2.equals(org.slf4j.h.f339615a3)) {
            if (!"23:59:60".equals(strNextToken)) {
                throw new IllegalArgumentException("Leap seconds can only be inserted at 23:59:60 - Date:" + gVarD0);
            }
            b10 = 1;
        } else {
            if (!strNextToken2.equals("-")) {
                throw new IllegalArgumentException("Invalid adjustment '" + strNextToken2 + "' in leap second rule for " + gVarD0);
            }
            if (!"23:59:59".equals(strNextToken)) {
                throw new IllegalArgumentException("Leap seconds can only be removed at 23:59:59 - Date:" + gVarD0);
            }
            b10 = -1;
            int i10 = 3 ^ (-1);
        }
        String strNextToken3 = stringTokenizer.nextToken();
        if (androidx.exifinterface.media.a.S4.equalsIgnoreCase(strNextToken3)) {
            return new a(gVarD0, b10);
        }
        throw new IllegalArgumentException("Only stationary ('S') leap seconds are supported, not '" + strNextToken3 + "'");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0042: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:10:0x0042 */
    private void s() throws Exception {
        BufferedReader bufferedReader;
        D("Parsing leap second file: " + this.f340484i);
        int i10 = 1;
        BufferedReader bufferedReader2 = null;
        line = null;
        String line = null;
        try {
            try {
                BufferedReader bufferedReader3 = new BufferedReader(new FileReader(this.f340484i));
                while (true) {
                    try {
                        line = bufferedReader3.readLine();
                        if (line == null) {
                            try {
                                bufferedReader3.close();
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        int iIndexOf = line.indexOf(35);
                        if (iIndexOf >= 0) {
                            line = line.substring(0, iIndexOf);
                        }
                        if (line.trim().length() != 0) {
                            a aVarR = r(line);
                            this.f340481f.put(aVarR.f340486a, Byte.valueOf(aVarR.f340487b));
                        }
                        i10++;
                    } catch (Exception e10) {
                        e = e10;
                        throw new Exception("Failed while processing file '" + this.f340484i + "' on line " + i10 + " '" + line + "'", e);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            throw th;
        }
    }

    private org.threeten.bp.j t(String str) {
        String lowerCase = str.toLowerCase();
        for (org.threeten.bp.j jVar : org.threeten.bp.j.values()) {
            if (h(lowerCase, jVar.name().toLowerCase())) {
                return jVar;
            }
        }
        throw new IllegalArgumentException("Unknown month: " + lowerCase);
    }

    private void u(StringTokenizer stringTokenizer, b bVar) {
        bVar.f340488a = t(stringTokenizer.nextToken());
        if (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.startsWith("last")) {
                bVar.f340489b = -1;
                bVar.f340491d = o(strNextToken.substring(4));
                bVar.f340490c = false;
            } else {
                int iIndexOf = strNextToken.indexOf(">=");
                if (iIndexOf > 0) {
                    bVar.f340491d = o(strNextToken.substring(0, iIndexOf));
                    strNextToken = strNextToken.substring(iIndexOf + 2);
                } else {
                    int iIndexOf2 = strNextToken.indexOf("<=");
                    if (iIndexOf2 > 0) {
                        bVar.f340491d = o(strNextToken.substring(0, iIndexOf2));
                        bVar.f340490c = false;
                        strNextToken = strNextToken.substring(iIndexOf2 + 2);
                    }
                }
                bVar.f340489b = Integer.parseInt(strNextToken);
            }
            if (stringTokenizer.hasMoreTokens()) {
                String strNextToken2 = stringTokenizer.nextToken();
                int iZ = z(strNextToken2);
                bVar.f340492e = (org.threeten.bp.i) c(org.threeten.bp.i.i0(cn.d.f(iZ, 86400)));
                bVar.f340493f = cn.d.d(iZ, 86400);
                bVar.f340494g = A(strNextToken2.charAt(strNextToken2.length() - 1));
            }
        }
    }

    private s v(String str) {
        return s.X(z(str));
    }

    private String w(String str) {
        if (!str.equals("-")) {
            return str;
        }
        int i10 = 2 | 0;
        return null;
    }

    private int x(String str) {
        return z(str);
    }

    private void y(StringTokenizer stringTokenizer) {
        C2453c c2453c = new C2453c();
        String strNextToken = stringTokenizer.nextToken();
        if (!this.f340476a.containsKey(strNextToken)) {
            this.f340476a.put(strNextToken, new ArrayList());
        }
        this.f340476a.get(strNextToken).add(c2453c);
        c2453c.f340496i = B(stringTokenizer.nextToken(), 0);
        int iB = B(stringTokenizer.nextToken(), c2453c.f340496i);
        c2453c.f340497j = iB;
        if (c2453c.f340496i <= iB) {
            w(stringTokenizer.nextToken());
            u(stringTokenizer, c2453c);
            c2453c.f340498k = x(stringTokenizer.nextToken());
            c2453c.f340499l = w(stringTokenizer.nextToken());
            return;
        }
        throw new IllegalArgumentException("Year order invalid: " + c2453c.f340496i + " > " + c2453c.f340497j);
    }

    private int z(String str) {
        if (str.equals("-")) {
            return 0;
        }
        boolean zStartsWith = str.startsWith("-");
        ParsePosition parsePosition = new ParsePosition(zStartsWith ? 1 : 0);
        org.threeten.bp.temporal.f fVarW = f340475k.w(str, parsePosition);
        if (fVarW == null || parsePosition.getErrorIndex() >= 0) {
            throw new IllegalArgumentException(str);
        }
        long jT = fVarW.t(org.threeten.bp.temporal.a.f340353t);
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340343m;
        Long lValueOf = fVarW.q(aVar) ? Long.valueOf(fVarW.t(aVar)) : null;
        org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.f340339k;
        Long lValueOf2 = fVarW.q(aVar2) ? Long.valueOf(fVarW.t(aVar2)) : null;
        int iLongValue = (int) ((jT * 3600) + ((lValueOf != null ? lValueOf.longValue() : 0L) * 60) + (lValueOf2 != null ? lValueOf2.longValue() : 0L));
        return zStartsWith ? -iLongValue : iLongValue;
    }

    void F(Map<Object, Object> map) {
        this.f340480e = map;
    }

    public void b() throws Exception {
        D("Compiling TZDB version " + this.f340482g);
        q();
        s();
        a();
        D("Compiled TZDB version " + this.f340482g);
    }

    <T> T c(T t10) {
        if (!this.f340480e.containsKey(t10)) {
            this.f340480e.put(t10, t10);
        }
        return (T) this.f340480e.get(t10);
    }

    public SortedMap<org.threeten.bp.g, Byte> d() {
        return this.f340481f;
    }

    public SortedMap<String, g> f() {
        return this.f340479d;
    }
}
