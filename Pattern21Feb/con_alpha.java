class con_alpha {
        public static void main(String[] args) {
		char ch = 'A';
                for(int i = 9 ;i <= 1 ;i--) {
			if(i%2==0) {
				System.out.print(i+" ");
			}else{
				System.out.print(ch+ " ");
			}
			ch++;
		}
		System.out.println();
        }
}
