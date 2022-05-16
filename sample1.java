class sample1 {
    public static void main(String[] args) {
        /* if文による条件分岐 */
        // 温度
        int temperature = 35;
        // 温度が10度以下なら寒い
        if (temperature <= 10) {   
            System.out.println("寒いです。"); 
            System.out.println("おはよう。"); 

            // 30度以上なら暑い 
        } else if (temperature >= 30) {
            System.out.println("暑いです。");
            System.out.println("おはよう。"); 
            // 11度〜29度なら快適
        } else {
            System.out.println("快適です。");
            System.out.println("おはよう。"); 
            System.out.println("ありがとう。"); 
        }           
    }
}
