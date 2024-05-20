class Question {
		    private String question;
		    private ArrayList<String> options;
		    private int correctOption;

		    public Question(String question, ArrayList<String> options, int correctOption) {
		        this.question = question;
		        this.options = options;
		        this.correctOption = correctOption;
		    }

		    public String getQuestion() {
		        return question;
		    }

		    public ArrayList<String> getOptions() {
		        return options;
		    }

		    public int getCorrectOption() {
		        return correctOption;
		    }
		}

		class Quiz {
		    private ArrayList<Question> questions;
		    private int score;

		    public Quiz(ArrayList<Question> questions) {
		        this.questions = questions;
		        this.score = 0;
		    }

		    public void startQuiz() {
		        Scanner scanner = new Scanner(System.in);
		        for (Question question : questions) {
		            System.out.println(question.getQuestion());
		            ArrayList<String> options = question.getOptions();
		            for (int i = 0; i < options.size(); i++) {
		                System.out.println((i + 1) + ". " + options.get(i));
		            }
		            System.out.print("Enter your answer (1-" + options.size() + "): ");
		            int userAnswer = scanner.nextInt();
		            if (userAnswer == question.getCorrectOption()) {
		                System.out.println("Correct!");
		                score++;
		            } else {
		                System.out.println("Incorrect!");
		            }
		        }
		        System.out.println("Quiz completed! Your score is: " + score);
		    }
		}

		