int[] fractionSum(int[] A, int[] B) {

  class Helper {
    int gcdEuclid(int a, int b) {
      if (a == 0) {
        return b;
      }
      return gcdEuclid(b % a, a);
    }
  }
  Helper h = new Helper();

  int[] C = {A[0] * B[1] + A[1] * B[0], A[0] * B[0]};
  int gcd = h.gcdEuclid(C[0], C[1]);

  C[0] /= gcd;
  C[1] /= gcd;

  return C;
}
