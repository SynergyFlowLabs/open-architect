package org.locationtech.jts.algorithm;

/* JADX INFO: loaded from: classes14.dex */
public class x {
    public static int a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        double d10 = aVar2.f338092a;
        double d11 = d10 - aVar.f338092a;
        double d12 = aVar2.f338093b;
        return b(d11, d12 - aVar.f338093b, aVar3.f338092a - d10, aVar3.f338093b - d12);
    }

    public static int b(double d10, double d11, double d12, double d13) {
        double d14 = d10;
        double d15 = d11;
        double d16 = d12;
        double d17 = d13;
        int i10 = -1;
        if (d14 == 0.0d || d17 == 0.0d) {
            if (d15 == 0.0d || d16 == 0.0d) {
                return 0;
            }
            if (d15 > 0.0d) {
                if (d16 > 0.0d) {
                    return -1;
                }
            } else if (d16 <= 0.0d) {
                return -1;
            }
        } else {
            if (d15 != 0.0d && d16 != 0.0d) {
                if (0.0d < d15) {
                    if (0.0d >= d17) {
                        d17 = -d17;
                        if (d15 <= d17) {
                            d16 = -d16;
                        } else {
                            d16 = -d16;
                            double d18 = d16;
                            d16 = d14;
                            d14 = d18;
                            double d19 = d17;
                            d17 = d15;
                            d15 = d19;
                            i10 = 1;
                        }
                    } else if (d15 <= d17) {
                        i10 = 1;
                    } else {
                        double d20 = d16;
                        d16 = d14;
                        d14 = d20;
                        double d21 = d17;
                        d17 = d15;
                        d15 = d21;
                    }
                } else if (0.0d < d17) {
                    d15 = -d15;
                    if (d15 <= d17) {
                        d14 = -d14;
                    } else {
                        d14 = -d14;
                        double d110 = d16;
                        d16 = d14;
                        d14 = d110;
                        double d111 = d17;
                        d17 = d15;
                        d15 = d111;
                        i10 = 1;
                    }
                } else if (d15 >= d17) {
                    d14 = -d14;
                    d15 = -d15;
                    d16 = -d16;
                    d17 = -d17;
                    i10 = 1;
                } else {
                    d14 = -d14;
                    d16 = -d16;
                    d15 = -d15;
                    d17 = -d17;
                    double d22 = d16;
                    d16 = d14;
                    d14 = d22;
                    double d23 = d17;
                    d17 = d15;
                    d15 = d23;
                }
                if (0.0d >= d14) {
                    if (0.0d >= d16 && d14 >= d16) {
                        i10 = -i10;
                        d14 = -d14;
                        d16 = -d16;
                    }
                    return -i10;
                }
                if (0.0d >= d16 || d14 > d16) {
                    return i10;
                }
                do {
                    double dFloor = Math.floor(d16 / d14);
                    d16 -= dFloor * d14;
                    d17 -= dFloor * d15;
                    if (d17 < 0.0d) {
                        return -i10;
                    }
                    if (d17 <= d15) {
                        if (d14 > d16 + d16) {
                            if (d15 < d17 + d17) {
                            }
                        } else {
                            if (d15 > d17 + d17) {
                                return -i10;
                            }
                            d16 = d14 - d16;
                            d17 = d15 - d17;
                            i10 = -i10;
                        }
                        if (d17 == 0.0d) {
                            if (d16 == 0.0d) {
                                return 0;
                            }
                            return -i10;
                        }
                        if (d16 != 0.0d) {
                            double dFloor2 = Math.floor(d14 / d16);
                            d14 -= dFloor2 * d16;
                            d15 -= dFloor2 * d17;
                            if (d15 >= 0.0d) {
                                if (d15 > d17) {
                                    return -i10;
                                }
                                if (d16 > d14 + d14) {
                                    if (d17 < d15 + d15) {
                                        return -i10;
                                    }
                                } else if (d17 <= d15 + d15) {
                                    d14 = d16 - d14;
                                    d15 = d17 - d15;
                                    i10 = -i10;
                                }
                                if (d15 == 0.0d) {
                                    if (d14 == 0.0d) {
                                        return 0;
                                    }
                                    return i10;
                                }
                            }
                        }
                        return i10;
                    }
                    return i10;
                } while (d14 != 0.0d);
                return -i10;
            }
            if (d17 > 0.0d) {
                if (d14 <= 0.0d) {
                    return -1;
                }
            } else if (d14 > 0.0d) {
                return -1;
            }
        }
        return 1;
    }
}
